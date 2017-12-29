


public class police_data_list {
	@ClassImpl(start = 0, end = 10)private String SN;
	@ClassImpl(start = 10, end = 20)private String SN1;
	@ClassImpl(start = 20, end = 120)private String CUSTOMER_NAME;
	@ClassImpl(start = 120, end = 130)private String CUSTOMER_ID;
	@ClassImpl(start = 130, end = 160)private String ACCT_NBR;
	@ClassImpl(start = 160, end = 170)private String START_DATE;
	@ClassImpl(start = 170, end = 180)private String END_DATE;
	@ClassImpl(start = 180, end = 190)private String NEW_START_DATE;
	@ClassImpl(start = 190, end = 200)private String NEW_END_DATE;
	@ClassImpl(start = 200, end = 215)private String DOC_NUM;
	@ClassImpl(start = 215, end = 216)private String QUERY_TYPE;
	@ClassImpl(start = 216, end = 246)private String SOURCE_SYSTEM_CODE;
	@ClassImpl(start = 246, end = 490)private String MEMO1;
	@ClassImpl(start = 490, end = 500)private String SNAPSHOT_DATE;
	
	public String getSN()
	{
		return SN;
	}
	public void setSN(String sN)
	{
		SN = sN;
	}
	public String getSN1()
	{
		return SN1;
	}
	public void setSN1(String sN1)
	{
		SN1 = sN1;
	}
	public String getCUSTOMER_NAME()
	{
		return CUSTOMER_NAME;
	}
	public void setCUSTOMER_NAME(String cUSTOMER_NAME)
	{
		CUSTOMER_NAME = cUSTOMER_NAME;
	}
	public String getCUSTOMER_ID()
	{
		return CUSTOMER_ID;
	}
	public void setCUSTOMER_ID(String cUSTOMER_ID)
	{
		CUSTOMER_ID = cUSTOMER_ID;
	}
	public String getACCT_NBR()
	{
		return ACCT_NBR;
	}
	public void setACCT_NBR(String aCCT_NBR)
	{
		ACCT_NBR = aCCT_NBR;
	}
	public String getSTART_DATE()
	{
		return START_DATE;
	}
	public void setSTART_DATE(String sTART_DATE)
	{
		START_DATE = sTART_DATE;
	}
	public String getEND_DATE()
	{
		return END_DATE;
	}
	public void setEND_DATE(String eND_DATE)
	{
		END_DATE = eND_DATE;
	}
	public String getNEW_START_DATE()
	{
		return NEW_START_DATE;
	}
	public void setNEW_START_DATE(String nEW_START_DATE)
	{
		NEW_START_DATE = nEW_START_DATE;
	}
	public String getNEW_END_DATE()
	{
		return NEW_END_DATE;
	}
	public void setNEW_END_DATE(String nEW_END_DATE)
	{
		NEW_END_DATE = nEW_END_DATE;
	}
	public String getDOC_NUM()
	{
		return DOC_NUM;
	}
	public void setDOC_NUM(String dOC_NUM)
	{
		DOC_NUM = dOC_NUM;
	}
	public String getQUERY_TYPE()
	{
		return QUERY_TYPE;
	}
	public void setQUERY_TYPE(String qUERY_TYPE)
	{
		QUERY_TYPE = qUERY_TYPE;
	}
	public String getSOURCE_SYSTEM_CODE()
	{
		return SOURCE_SYSTEM_CODE;
	}
	public void setSOURCE_SYSTEM_CODE(String sOURCE_SYSTEM_CODE)
	{
		SOURCE_SYSTEM_CODE = sOURCE_SYSTEM_CODE;
	}
	public String getMEMO1()
	{
		return MEMO1;
	}
	public void setMEMO1(String mEMO1)
	{
		MEMO1 = mEMO1;
	}
	public String getSNAPSHOT_DATE()
	{
		return SNAPSHOT_DATE;
	}
	public void setSNAPSHOT_DATE(String sNAPSHOT_DATE)
	{
		SNAPSHOT_DATE = sNAPSHOT_DATE;
	}
}
