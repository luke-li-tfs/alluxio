/*
 * The Alluxio Open Foundation licenses this work under the Apache License, version 2.0
 * (the "License"). You may not use this work except in compliance with the License, which is
 * available at www.apache.org/licenses/LICENSE-2.0
 *
 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied, as more fully set forth in the License.
 *
 * See the NOTICE file distributed with this work for information regarding copyright ownership.
 */

package alluxio.job.wire;

import com.google.common.collect.Maps;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Tests the wire format of {@link JobServiceSummary}.
 */
public class JobServiceSummaryTest {
  @Test
  public void testJobServiceSummaryBuilder() {

    List<JobInfo> jobInfos = new ArrayList<>();

    jobInfos.add(createJobInfo(Status.CANCELED));
    jobInfos.add(createJobInfo(Status.COMPLETED));
    jobInfos.add(createJobInfo(Status.COMPLETED));
    jobInfos.add(createJobInfo(Status.CANCELED));
    jobInfos.add(createJobInfo(Status.RUNNING));

    JobServiceSummary summary = new JobServiceSummary(jobInfos);

    Collection<StatusSummary> summaryPerStatus = summary.getSummaryPerStatus();

    Assert.assertEquals("Unexpected length of summaryPerStatus",
            Status.values().length, summaryPerStatus.size());

    Map<Status, Long> groupByStatus = Maps.newHashMap();

    for (StatusSummary statusSummary : summaryPerStatus) {
      groupByStatus.put(statusSummary.getStatus(), statusSummary.getCount());
    }

    Assert.assertEquals("Unexpected length after grouping by status, "
                    + "perhaps there were duplicate status in StatusSummary",
            Status.values().length, summaryPerStatus.size());

    for (Status status : groupByStatus.keySet()) {
      long count = groupByStatus.get(status);
      switch (status) {
        case COMPLETED:
          Assert.assertEquals("COMPLETED count unexpected", 2L, count);
          break;
        case CANCELED:
          Assert.assertEquals("CANCELED count unexpected", 2L, count);
          break;
        case RUNNING:
          Assert.assertEquals("RUNNING count unexpected", 1L, count);
          break;
        default:
          Assert.assertEquals("Unexpected status having count value: " + status, 0L, count);
      }
    }
  }

  private JobInfo createJobInfo(Status status) {
    JobInfo jobInfo = new JobInfo();
    jobInfo.setStatus(status);
    return jobInfo;
  }
}
