public class acct_data_list {
	@ClassImpl(start = 0, end = 10) String SN;
	@ClassImpl(start = 10, end = 20) String SN1;
	@ClassImpl(start = 20, end = 120) String CUSTOMER_NAME;
	@ClassImpl(start = 120, end = 138) String CUSTOMER_ID;
	@ClassImpl(start = 138, end = 148) String MEMO1;
	@ClassImpl(start = 148, end = 158) String MEMO2;
	@ClassImpl(start = 158, end = 168) String MEMO3;
	@ClassImpl(start = 168, end = 178) String MEMO4;
	@ClassImpl(start = 178, end = 228) String MEMO5;
	@ClassImpl(start = 228, end = 238) String STD_DATE;
	@ClassImpl(start = 238, end = 253) String DOC_NUM;
	@ClassImpl(start = 253, end = 254) String MONTH13_FLG;
	
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
	public String getMEMO1()
	{
		return MEMO1;
	}
	public void setMEMO1(String mEMO1)
	{
		MEMO1 = mEMO1;
	}
	public String getMEMO2()
	{
		return MEMO2;
	}
	public void setMEMO2(String mEMO2)
	{
		MEMO2 = mEMO2;
	}
	public String getMEMO3()
	{
		return MEMO3;
	}
	public void setMEMO3(String mEMO3)
	{
		MEMO3 = mEMO3;
	}
	public String getMEMO4()
	{
		return MEMO4;
	}
	public void setMEMO4(String mEMO4)
	{
		MEMO4 = mEMO4;
	}
	public String getMEMO5()
	{
		return MEMO5;
	}
	public void setMEMO5(String mEMO5)
	{
		MEMO5 = mEMO5;
	}
	public String getSTD_DATE()
	{
		return STD_DATE;
	}
	public void setSTD_DATE(String sTD_DATE)
	{
		STD_DATE = sTD_DATE;
	}
	public String getDOC_NUM()
	{
		return DOC_NUM;
	}
	public void setDOC_NUM(String dOC_NUM)
	{
		DOC_NUM = dOC_NUM;
	}
	public String getMONTH13_FLG()
	{
		return MONTH13_FLG;
	}
	public void setMONTH13_FLG(String mONTH13_FLG)
	{
		MONTH13_FLG = mONTH13_FLG;
	}
}
