import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollectionSort {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("CRMOTEDW01_ACCT_DRV_20171012");
		list.add("CRMOTEDW01_ACCT_DRV_20171120");
		list.add("CRMOTEDW01_ACCT_DRV_20170513");
		System.out.println(Collections.max(list));
	}

}
