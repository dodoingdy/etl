// ORM class for table 'BQD_ODS_TEST.ATMP_ACCTTRFTMP'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Dec 07 14:59:08 CST 2017
// For connector: org.apache.sqoop.manager.OracleManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class BQD_ODS_TEST_ATMP_ACCTTRFTMP extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String TX_DT;
  public String get_TX_DT() {
    return TX_DT;
  }
  public void set_TX_DT(String TX_DT) {
    this.TX_DT = TX_DT;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_TX_DT(String TX_DT) {
    this.TX_DT = TX_DT;
    return this;
  }
  private String SOURCE_ID;
  public String get_SOURCE_ID() {
    return SOURCE_ID;
  }
  public void set_SOURCE_ID(String SOURCE_ID) {
    this.SOURCE_ID = SOURCE_ID;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_SOURCE_ID(String SOURCE_ID) {
    this.SOURCE_ID = SOURCE_ID;
    return this;
  }
  private String BRANCHID;
  public String get_BRANCHID() {
    return BRANCHID;
  }
  public void set_BRANCHID(String BRANCHID) {
    this.BRANCHID = BRANCHID;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_BRANCHID(String BRANCHID) {
    this.BRANCHID = BRANCHID;
    return this;
  }
  private String TELLERID;
  public String get_TELLERID() {
    return TELLERID;
  }
  public void set_TELLERID(String TELLERID) {
    this.TELLERID = TELLERID;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_TELLERID(String TELLERID) {
    this.TELLERID = TELLERID;
    return this;
  }
  private String DEVICETYPE;
  public String get_DEVICETYPE() {
    return DEVICETYPE;
  }
  public void set_DEVICETYPE(String DEVICETYPE) {
    this.DEVICETYPE = DEVICETYPE;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_DEVICETYPE(String DEVICETYPE) {
    this.DEVICETYPE = DEVICETYPE;
    return this;
  }
  private String CHNLTYPE;
  public String get_CHNLTYPE() {
    return CHNLTYPE;
  }
  public void set_CHNLTYPE(String CHNLTYPE) {
    this.CHNLTYPE = CHNLTYPE;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_CHNLTYPE(String CHNLTYPE) {
    this.CHNLTYPE = CHNLTYPE;
    return this;
  }
  private String TELLERID2;
  public String get_TELLERID2() {
    return TELLERID2;
  }
  public void set_TELLERID2(String TELLERID2) {
    this.TELLERID2 = TELLERID2;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_TELLERID2(String TELLERID2) {
    this.TELLERID2 = TELLERID2;
    return this;
  }
  private String TSPTRANCODE;
  public String get_TSPTRANCODE() {
    return TSPTRANCODE;
  }
  public void set_TSPTRANCODE(String TSPTRANCODE) {
    this.TSPTRANCODE = TSPTRANCODE;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_TSPTRANCODE(String TSPTRANCODE) {
    this.TSPTRANCODE = TSPTRANCODE;
    return this;
  }
  private String TRANPROCCODE;
  public String get_TRANPROCCODE() {
    return TRANPROCCODE;
  }
  public void set_TRANPROCCODE(String TRANPROCCODE) {
    this.TRANPROCCODE = TRANPROCCODE;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_TRANPROCCODE(String TRANPROCCODE) {
    this.TRANPROCCODE = TRANPROCCODE;
    return this;
  }
  private java.math.BigDecimal TRANAMT;
  public java.math.BigDecimal get_TRANAMT() {
    return TRANAMT;
  }
  public void set_TRANAMT(java.math.BigDecimal TRANAMT) {
    this.TRANAMT = TRANAMT;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_TRANAMT(java.math.BigDecimal TRANAMT) {
    this.TRANAMT = TRANAMT;
    return this;
  }
  private java.math.BigDecimal TRANFEE;
  public java.math.BigDecimal get_TRANFEE() {
    return TRANFEE;
  }
  public void set_TRANFEE(java.math.BigDecimal TRANFEE) {
    this.TRANFEE = TRANFEE;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_TRANFEE(java.math.BigDecimal TRANFEE) {
    this.TRANFEE = TRANFEE;
    return this;
  }
  private String CURRENCYTYPE;
  public String get_CURRENCYTYPE() {
    return CURRENCYTYPE;
  }
  public void set_CURRENCYTYPE(String CURRENCYTYPE) {
    this.CURRENCYTYPE = CURRENCYTYPE;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_CURRENCYTYPE(String CURRENCYTYPE) {
    this.CURRENCYTYPE = CURRENCYTYPE;
    return this;
  }
  private java.math.BigDecimal DEVCYCLENUM;
  public java.math.BigDecimal get_DEVCYCLENUM() {
    return DEVCYCLENUM;
  }
  public void set_DEVCYCLENUM(java.math.BigDecimal DEVCYCLENUM) {
    this.DEVCYCLENUM = DEVCYCLENUM;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_DEVCYCLENUM(java.math.BigDecimal DEVCYCLENUM) {
    this.DEVCYCLENUM = DEVCYCLENUM;
    return this;
  }
  private String CARDNO;
  public String get_CARDNO() {
    return CARDNO;
  }
  public void set_CARDNO(String CARDNO) {
    this.CARDNO = CARDNO;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_CARDNO(String CARDNO) {
    this.CARDNO = CARDNO;
    return this;
  }
  private String ACCOUNTNO;
  public String get_ACCOUNTNO() {
    return ACCOUNTNO;
  }
  public void set_ACCOUNTNO(String ACCOUNTNO) {
    this.ACCOUNTNO = ACCOUNTNO;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_ACCOUNTNO(String ACCOUNTNO) {
    this.ACCOUNTNO = ACCOUNTNO;
    return this;
  }
  private String CIF_ID;
  public String get_CIF_ID() {
    return CIF_ID;
  }
  public void set_CIF_ID(String CIF_ID) {
    this.CIF_ID = CIF_ID;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_CIF_ID(String CIF_ID) {
    this.CIF_ID = CIF_ID;
    return this;
  }
  private String CIF_NAME;
  public String get_CIF_NAME() {
    return CIF_NAME;
  }
  public void set_CIF_NAME(String CIF_NAME) {
    this.CIF_NAME = CIF_NAME;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_CIF_NAME(String CIF_NAME) {
    this.CIF_NAME = CIF_NAME;
    return this;
  }
  private String CARDNO2;
  public String get_CARDNO2() {
    return CARDNO2;
  }
  public void set_CARDNO2(String CARDNO2) {
    this.CARDNO2 = CARDNO2;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_CARDNO2(String CARDNO2) {
    this.CARDNO2 = CARDNO2;
    return this;
  }
  private String ACCOUNTNO2;
  public String get_ACCOUNTNO2() {
    return ACCOUNTNO2;
  }
  public void set_ACCOUNTNO2(String ACCOUNTNO2) {
    this.ACCOUNTNO2 = ACCOUNTNO2;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_ACCOUNTNO2(String ACCOUNTNO2) {
    this.ACCOUNTNO2 = ACCOUNTNO2;
    return this;
  }
  private String CIF_ID2;
  public String get_CIF_ID2() {
    return CIF_ID2;
  }
  public void set_CIF_ID2(String CIF_ID2) {
    this.CIF_ID2 = CIF_ID2;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_CIF_ID2(String CIF_ID2) {
    this.CIF_ID2 = CIF_ID2;
    return this;
  }
  private String CIF_NAME2;
  public String get_CIF_NAME2() {
    return CIF_NAME2;
  }
  public void set_CIF_NAME2(String CIF_NAME2) {
    this.CIF_NAME2 = CIF_NAME2;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_CIF_NAME2(String CIF_NAME2) {
    this.CIF_NAME2 = CIF_NAME2;
    return this;
  }
  private String TSPDATE;
  public String get_TSPDATE() {
    return TSPDATE;
  }
  public void set_TSPDATE(String TSPDATE) {
    this.TSPDATE = TSPDATE;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_TSPDATE(String TSPDATE) {
    this.TSPDATE = TSPDATE;
    return this;
  }
  private String TSPTIME;
  public String get_TSPTIME() {
    return TSPTIME;
  }
  public void set_TSPTIME(String TSPTIME) {
    this.TSPTIME = TSPTIME;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_TSPTIME(String TSPTIME) {
    this.TSPTIME = TSPTIME;
    return this;
  }
  private String HOSTDATE;
  public String get_HOSTDATE() {
    return HOSTDATE;
  }
  public void set_HOSTDATE(String HOSTDATE) {
    this.HOSTDATE = HOSTDATE;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_HOSTDATE(String HOSTDATE) {
    this.HOSTDATE = HOSTDATE;
    return this;
  }
  private String HOSTTIME;
  public String get_HOSTTIME() {
    return HOSTTIME;
  }
  public void set_HOSTTIME(String HOSTTIME) {
    this.HOSTTIME = HOSTTIME;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_HOSTTIME(String HOSTTIME) {
    this.HOSTTIME = HOSTTIME;
    return this;
  }
  private String CLIENTDATE;
  public String get_CLIENTDATE() {
    return CLIENTDATE;
  }
  public void set_CLIENTDATE(String CLIENTDATE) {
    this.CLIENTDATE = CLIENTDATE;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_CLIENTDATE(String CLIENTDATE) {
    this.CLIENTDATE = CLIENTDATE;
    return this;
  }
  private String CLIENTTIME;
  public String get_CLIENTTIME() {
    return CLIENTTIME;
  }
  public void set_CLIENTTIME(String CLIENTTIME) {
    this.CLIENTTIME = CLIENTTIME;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_CLIENTTIME(String CLIENTTIME) {
    this.CLIENTTIME = CLIENTTIME;
    return this;
  }
  private String DELDATE;
  public String get_DELDATE() {
    return DELDATE;
  }
  public void set_DELDATE(String DELDATE) {
    this.DELDATE = DELDATE;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_DELDATE(String DELDATE) {
    this.DELDATE = DELDATE;
    return this;
  }
  private String DELTIME;
  public String get_DELTIME() {
    return DELTIME;
  }
  public void set_DELTIME(String DELTIME) {
    this.DELTIME = DELTIME;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_DELTIME(String DELTIME) {
    this.DELTIME = DELTIME;
    return this;
  }
  private String CYCDATE;
  public String get_CYCDATE() {
    return CYCDATE;
  }
  public void set_CYCDATE(String CYCDATE) {
    this.CYCDATE = CYCDATE;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_CYCDATE(String CYCDATE) {
    this.CYCDATE = CYCDATE;
    return this;
  }
  private String TSPDATE2;
  public String get_TSPDATE2() {
    return TSPDATE2;
  }
  public void set_TSPDATE2(String TSPDATE2) {
    this.TSPDATE2 = TSPDATE2;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_TSPDATE2(String TSPDATE2) {
    this.TSPDATE2 = TSPDATE2;
    return this;
  }
  private String TSPTIME2;
  public String get_TSPTIME2() {
    return TSPTIME2;
  }
  public void set_TSPTIME2(String TSPTIME2) {
    this.TSPTIME2 = TSPTIME2;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_TSPTIME2(String TSPTIME2) {
    this.TSPTIME2 = TSPTIME2;
    return this;
  }
  private String CYCDATE2;
  public String get_CYCDATE2() {
    return CYCDATE2;
  }
  public void set_CYCDATE2(String CYCDATE2) {
    this.CYCDATE2 = CYCDATE2;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_CYCDATE2(String CYCDATE2) {
    this.CYCDATE2 = CYCDATE2;
    return this;
  }
  private String TSPDATE3;
  public String get_TSPDATE3() {
    return TSPDATE3;
  }
  public void set_TSPDATE3(String TSPDATE3) {
    this.TSPDATE3 = TSPDATE3;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_TSPDATE3(String TSPDATE3) {
    this.TSPDATE3 = TSPDATE3;
    return this;
  }
  private String TSPTIME3;
  public String get_TSPTIME3() {
    return TSPTIME3;
  }
  public void set_TSPTIME3(String TSPTIME3) {
    this.TSPTIME3 = TSPTIME3;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_TSPTIME3(String TSPTIME3) {
    this.TSPTIME3 = TSPTIME3;
    return this;
  }
  private String TSPTRACENUM;
  public String get_TSPTRACENUM() {
    return TSPTRACENUM;
  }
  public void set_TSPTRACENUM(String TSPTRACENUM) {
    this.TSPTRACENUM = TSPTRACENUM;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_TSPTRACENUM(String TSPTRACENUM) {
    this.TSPTRACENUM = TSPTRACENUM;
    return this;
  }
  private String HOSTTRACENUM;
  public String get_HOSTTRACENUM() {
    return HOSTTRACENUM;
  }
  public void set_HOSTTRACENUM(String HOSTTRACENUM) {
    this.HOSTTRACENUM = HOSTTRACENUM;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_HOSTTRACENUM(String HOSTTRACENUM) {
    this.HOSTTRACENUM = HOSTTRACENUM;
    return this;
  }
  private String CLIENTTRACENUM;
  public String get_CLIENTTRACENUM() {
    return CLIENTTRACENUM;
  }
  public void set_CLIENTTRACENUM(String CLIENTTRACENUM) {
    this.CLIENTTRACENUM = CLIENTTRACENUM;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_CLIENTTRACENUM(String CLIENTTRACENUM) {
    this.CLIENTTRACENUM = CLIENTTRACENUM;
    return this;
  }
  private String TSPTRACENUM2;
  public String get_TSPTRACENUM2() {
    return TSPTRACENUM2;
  }
  public void set_TSPTRACENUM2(String TSPTRACENUM2) {
    this.TSPTRACENUM2 = TSPTRACENUM2;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_TSPTRACENUM2(String TSPTRACENUM2) {
    this.TSPTRACENUM2 = TSPTRACENUM2;
    return this;
  }
  private String HOSTTRACENUM2;
  public String get_HOSTTRACENUM2() {
    return HOSTTRACENUM2;
  }
  public void set_HOSTTRACENUM2(String HOSTTRACENUM2) {
    this.HOSTTRACENUM2 = HOSTTRACENUM2;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_HOSTTRACENUM2(String HOSTTRACENUM2) {
    this.HOSTTRACENUM2 = HOSTTRACENUM2;
    return this;
  }
  private String TSPTRACENUM3;
  public String get_TSPTRACENUM3() {
    return TSPTRACENUM3;
  }
  public void set_TSPTRACENUM3(String TSPTRACENUM3) {
    this.TSPTRACENUM3 = TSPTRACENUM3;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_TSPTRACENUM3(String TSPTRACENUM3) {
    this.TSPTRACENUM3 = TSPTRACENUM3;
    return this;
  }
  private String HOSTTRACENUM3;
  public String get_HOSTTRACENUM3() {
    return HOSTTRACENUM3;
  }
  public void set_HOSTTRACENUM3(String HOSTTRACENUM3) {
    this.HOSTTRACENUM3 = HOSTTRACENUM3;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_HOSTTRACENUM3(String HOSTTRACENUM3) {
    this.HOSTTRACENUM3 = HOSTTRACENUM3;
    return this;
  }
  private String CLIENTTRACENUM3;
  public String get_CLIENTTRACENUM3() {
    return CLIENTTRACENUM3;
  }
  public void set_CLIENTTRACENUM3(String CLIENTTRACENUM3) {
    this.CLIENTTRACENUM3 = CLIENTTRACENUM3;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_CLIENTTRACENUM3(String CLIENTTRACENUM3) {
    this.CLIENTTRACENUM3 = CLIENTTRACENUM3;
    return this;
  }
  private String TSPRETCODE;
  public String get_TSPRETCODE() {
    return TSPRETCODE;
  }
  public void set_TSPRETCODE(String TSPRETCODE) {
    this.TSPRETCODE = TSPRETCODE;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_TSPRETCODE(String TSPRETCODE) {
    this.TSPRETCODE = TSPRETCODE;
    return this;
  }
  private String HOSTRETCODE;
  public String get_HOSTRETCODE() {
    return HOSTRETCODE;
  }
  public void set_HOSTRETCODE(String HOSTRETCODE) {
    this.HOSTRETCODE = HOSTRETCODE;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_HOSTRETCODE(String HOSTRETCODE) {
    this.HOSTRETCODE = HOSTRETCODE;
    return this;
  }
  private String DEVRETCODE;
  public String get_DEVRETCODE() {
    return DEVRETCODE;
  }
  public void set_DEVRETCODE(String DEVRETCODE) {
    this.DEVRETCODE = DEVRETCODE;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_DEVRETCODE(String DEVRETCODE) {
    this.DEVRETCODE = DEVRETCODE;
    return this;
  }
  private String TRANSTAT;
  public String get_TRANSTAT() {
    return TRANSTAT;
  }
  public void set_TRANSTAT(String TRANSTAT) {
    this.TRANSTAT = TRANSTAT;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_TRANSTAT(String TRANSTAT) {
    this.TRANSTAT = TRANSTAT;
    return this;
  }
  private String ODSSTAT;
  public String get_ODSSTAT() {
    return ODSSTAT;
  }
  public void set_ODSSTAT(String ODSSTAT) {
    this.ODSSTAT = ODSSTAT;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_ODSSTAT(String ODSSTAT) {
    this.ODSSTAT = ODSSTAT;
    return this;
  }
  private String MEMO1;
  public String get_MEMO1() {
    return MEMO1;
  }
  public void set_MEMO1(String MEMO1) {
    this.MEMO1 = MEMO1;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_MEMO1(String MEMO1) {
    this.MEMO1 = MEMO1;
    return this;
  }
  private String MEMO2;
  public String get_MEMO2() {
    return MEMO2;
  }
  public void set_MEMO2(String MEMO2) {
    this.MEMO2 = MEMO2;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_MEMO2(String MEMO2) {
    this.MEMO2 = MEMO2;
    return this;
  }
  private String MEMO3;
  public String get_MEMO3() {
    return MEMO3;
  }
  public void set_MEMO3(String MEMO3) {
    this.MEMO3 = MEMO3;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_MEMO3(String MEMO3) {
    this.MEMO3 = MEMO3;
    return this;
  }
  private String DELCYCDATE;
  public String get_DELCYCDATE() {
    return DELCYCDATE;
  }
  public void set_DELCYCDATE(String DELCYCDATE) {
    this.DELCYCDATE = DELCYCDATE;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_DELCYCDATE(String DELCYCDATE) {
    this.DELCYCDATE = DELCYCDATE;
    return this;
  }
  private String CLIENTDATE2;
  public String get_CLIENTDATE2() {
    return CLIENTDATE2;
  }
  public void set_CLIENTDATE2(String CLIENTDATE2) {
    this.CLIENTDATE2 = CLIENTDATE2;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_CLIENTDATE2(String CLIENTDATE2) {
    this.CLIENTDATE2 = CLIENTDATE2;
    return this;
  }
  private String CLIENTTIME2;
  public String get_CLIENTTIME2() {
    return CLIENTTIME2;
  }
  public void set_CLIENTTIME2(String CLIENTTIME2) {
    this.CLIENTTIME2 = CLIENTTIME2;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_CLIENTTIME2(String CLIENTTIME2) {
    this.CLIENTTIME2 = CLIENTTIME2;
    return this;
  }
  private String CLIENTTRACENUM2;
  public String get_CLIENTTRACENUM2() {
    return CLIENTTRACENUM2;
  }
  public void set_CLIENTTRACENUM2(String CLIENTTRACENUM2) {
    this.CLIENTTRACENUM2 = CLIENTTRACENUM2;
  }
  public BQD_ODS_TEST_ATMP_ACCTTRFTMP with_CLIENTTRACENUM2(String CLIENTTRACENUM2) {
    this.CLIENTTRACENUM2 = CLIENTTRACENUM2;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof BQD_ODS_TEST_ATMP_ACCTTRFTMP)) {
      return false;
    }
    BQD_ODS_TEST_ATMP_ACCTTRFTMP that = (BQD_ODS_TEST_ATMP_ACCTTRFTMP) o;
    boolean equal = true;
    equal = equal && (this.TX_DT == null ? that.TX_DT == null : this.TX_DT.equals(that.TX_DT));
    equal = equal && (this.SOURCE_ID == null ? that.SOURCE_ID == null : this.SOURCE_ID.equals(that.SOURCE_ID));
    equal = equal && (this.BRANCHID == null ? that.BRANCHID == null : this.BRANCHID.equals(that.BRANCHID));
    equal = equal && (this.TELLERID == null ? that.TELLERID == null : this.TELLERID.equals(that.TELLERID));
    equal = equal && (this.DEVICETYPE == null ? that.DEVICETYPE == null : this.DEVICETYPE.equals(that.DEVICETYPE));
    equal = equal && (this.CHNLTYPE == null ? that.CHNLTYPE == null : this.CHNLTYPE.equals(that.CHNLTYPE));
    equal = equal && (this.TELLERID2 == null ? that.TELLERID2 == null : this.TELLERID2.equals(that.TELLERID2));
    equal = equal && (this.TSPTRANCODE == null ? that.TSPTRANCODE == null : this.TSPTRANCODE.equals(that.TSPTRANCODE));
    equal = equal && (this.TRANPROCCODE == null ? that.TRANPROCCODE == null : this.TRANPROCCODE.equals(that.TRANPROCCODE));
    equal = equal && (this.TRANAMT == null ? that.TRANAMT == null : this.TRANAMT.equals(that.TRANAMT));
    equal = equal && (this.TRANFEE == null ? that.TRANFEE == null : this.TRANFEE.equals(that.TRANFEE));
    equal = equal && (this.CURRENCYTYPE == null ? that.CURRENCYTYPE == null : this.CURRENCYTYPE.equals(that.CURRENCYTYPE));
    equal = equal && (this.DEVCYCLENUM == null ? that.DEVCYCLENUM == null : this.DEVCYCLENUM.equals(that.DEVCYCLENUM));
    equal = equal && (this.CARDNO == null ? that.CARDNO == null : this.CARDNO.equals(that.CARDNO));
    equal = equal && (this.ACCOUNTNO == null ? that.ACCOUNTNO == null : this.ACCOUNTNO.equals(that.ACCOUNTNO));
    equal = equal && (this.CIF_ID == null ? that.CIF_ID == null : this.CIF_ID.equals(that.CIF_ID));
    equal = equal && (this.CIF_NAME == null ? that.CIF_NAME == null : this.CIF_NAME.equals(that.CIF_NAME));
    equal = equal && (this.CARDNO2 == null ? that.CARDNO2 == null : this.CARDNO2.equals(that.CARDNO2));
    equal = equal && (this.ACCOUNTNO2 == null ? that.ACCOUNTNO2 == null : this.ACCOUNTNO2.equals(that.ACCOUNTNO2));
    equal = equal && (this.CIF_ID2 == null ? that.CIF_ID2 == null : this.CIF_ID2.equals(that.CIF_ID2));
    equal = equal && (this.CIF_NAME2 == null ? that.CIF_NAME2 == null : this.CIF_NAME2.equals(that.CIF_NAME2));
    equal = equal && (this.TSPDATE == null ? that.TSPDATE == null : this.TSPDATE.equals(that.TSPDATE));
    equal = equal && (this.TSPTIME == null ? that.TSPTIME == null : this.TSPTIME.equals(that.TSPTIME));
    equal = equal && (this.HOSTDATE == null ? that.HOSTDATE == null : this.HOSTDATE.equals(that.HOSTDATE));
    equal = equal && (this.HOSTTIME == null ? that.HOSTTIME == null : this.HOSTTIME.equals(that.HOSTTIME));
    equal = equal && (this.CLIENTDATE == null ? that.CLIENTDATE == null : this.CLIENTDATE.equals(that.CLIENTDATE));
    equal = equal && (this.CLIENTTIME == null ? that.CLIENTTIME == null : this.CLIENTTIME.equals(that.CLIENTTIME));
    equal = equal && (this.DELDATE == null ? that.DELDATE == null : this.DELDATE.equals(that.DELDATE));
    equal = equal && (this.DELTIME == null ? that.DELTIME == null : this.DELTIME.equals(that.DELTIME));
    equal = equal && (this.CYCDATE == null ? that.CYCDATE == null : this.CYCDATE.equals(that.CYCDATE));
    equal = equal && (this.TSPDATE2 == null ? that.TSPDATE2 == null : this.TSPDATE2.equals(that.TSPDATE2));
    equal = equal && (this.TSPTIME2 == null ? that.TSPTIME2 == null : this.TSPTIME2.equals(that.TSPTIME2));
    equal = equal && (this.CYCDATE2 == null ? that.CYCDATE2 == null : this.CYCDATE2.equals(that.CYCDATE2));
    equal = equal && (this.TSPDATE3 == null ? that.TSPDATE3 == null : this.TSPDATE3.equals(that.TSPDATE3));
    equal = equal && (this.TSPTIME3 == null ? that.TSPTIME3 == null : this.TSPTIME3.equals(that.TSPTIME3));
    equal = equal && (this.TSPTRACENUM == null ? that.TSPTRACENUM == null : this.TSPTRACENUM.equals(that.TSPTRACENUM));
    equal = equal && (this.HOSTTRACENUM == null ? that.HOSTTRACENUM == null : this.HOSTTRACENUM.equals(that.HOSTTRACENUM));
    equal = equal && (this.CLIENTTRACENUM == null ? that.CLIENTTRACENUM == null : this.CLIENTTRACENUM.equals(that.CLIENTTRACENUM));
    equal = equal && (this.TSPTRACENUM2 == null ? that.TSPTRACENUM2 == null : this.TSPTRACENUM2.equals(that.TSPTRACENUM2));
    equal = equal && (this.HOSTTRACENUM2 == null ? that.HOSTTRACENUM2 == null : this.HOSTTRACENUM2.equals(that.HOSTTRACENUM2));
    equal = equal && (this.TSPTRACENUM3 == null ? that.TSPTRACENUM3 == null : this.TSPTRACENUM3.equals(that.TSPTRACENUM3));
    equal = equal && (this.HOSTTRACENUM3 == null ? that.HOSTTRACENUM3 == null : this.HOSTTRACENUM3.equals(that.HOSTTRACENUM3));
    equal = equal && (this.CLIENTTRACENUM3 == null ? that.CLIENTTRACENUM3 == null : this.CLIENTTRACENUM3.equals(that.CLIENTTRACENUM3));
    equal = equal && (this.TSPRETCODE == null ? that.TSPRETCODE == null : this.TSPRETCODE.equals(that.TSPRETCODE));
    equal = equal && (this.HOSTRETCODE == null ? that.HOSTRETCODE == null : this.HOSTRETCODE.equals(that.HOSTRETCODE));
    equal = equal && (this.DEVRETCODE == null ? that.DEVRETCODE == null : this.DEVRETCODE.equals(that.DEVRETCODE));
    equal = equal && (this.TRANSTAT == null ? that.TRANSTAT == null : this.TRANSTAT.equals(that.TRANSTAT));
    equal = equal && (this.ODSSTAT == null ? that.ODSSTAT == null : this.ODSSTAT.equals(that.ODSSTAT));
    equal = equal && (this.MEMO1 == null ? that.MEMO1 == null : this.MEMO1.equals(that.MEMO1));
    equal = equal && (this.MEMO2 == null ? that.MEMO2 == null : this.MEMO2.equals(that.MEMO2));
    equal = equal && (this.MEMO3 == null ? that.MEMO3 == null : this.MEMO3.equals(that.MEMO3));
    equal = equal && (this.DELCYCDATE == null ? that.DELCYCDATE == null : this.DELCYCDATE.equals(that.DELCYCDATE));
    equal = equal && (this.CLIENTDATE2 == null ? that.CLIENTDATE2 == null : this.CLIENTDATE2.equals(that.CLIENTDATE2));
    equal = equal && (this.CLIENTTIME2 == null ? that.CLIENTTIME2 == null : this.CLIENTTIME2.equals(that.CLIENTTIME2));
    equal = equal && (this.CLIENTTRACENUM2 == null ? that.CLIENTTRACENUM2 == null : this.CLIENTTRACENUM2.equals(that.CLIENTTRACENUM2));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof BQD_ODS_TEST_ATMP_ACCTTRFTMP)) {
      return false;
    }
    BQD_ODS_TEST_ATMP_ACCTTRFTMP that = (BQD_ODS_TEST_ATMP_ACCTTRFTMP) o;
    boolean equal = true;
    equal = equal && (this.TX_DT == null ? that.TX_DT == null : this.TX_DT.equals(that.TX_DT));
    equal = equal && (this.SOURCE_ID == null ? that.SOURCE_ID == null : this.SOURCE_ID.equals(that.SOURCE_ID));
    equal = equal && (this.BRANCHID == null ? that.BRANCHID == null : this.BRANCHID.equals(that.BRANCHID));
    equal = equal && (this.TELLERID == null ? that.TELLERID == null : this.TELLERID.equals(that.TELLERID));
    equal = equal && (this.DEVICETYPE == null ? that.DEVICETYPE == null : this.DEVICETYPE.equals(that.DEVICETYPE));
    equal = equal && (this.CHNLTYPE == null ? that.CHNLTYPE == null : this.CHNLTYPE.equals(that.CHNLTYPE));
    equal = equal && (this.TELLERID2 == null ? that.TELLERID2 == null : this.TELLERID2.equals(that.TELLERID2));
    equal = equal && (this.TSPTRANCODE == null ? that.TSPTRANCODE == null : this.TSPTRANCODE.equals(that.TSPTRANCODE));
    equal = equal && (this.TRANPROCCODE == null ? that.TRANPROCCODE == null : this.TRANPROCCODE.equals(that.TRANPROCCODE));
    equal = equal && (this.TRANAMT == null ? that.TRANAMT == null : this.TRANAMT.equals(that.TRANAMT));
    equal = equal && (this.TRANFEE == null ? that.TRANFEE == null : this.TRANFEE.equals(that.TRANFEE));
    equal = equal && (this.CURRENCYTYPE == null ? that.CURRENCYTYPE == null : this.CURRENCYTYPE.equals(that.CURRENCYTYPE));
    equal = equal && (this.DEVCYCLENUM == null ? that.DEVCYCLENUM == null : this.DEVCYCLENUM.equals(that.DEVCYCLENUM));
    equal = equal && (this.CARDNO == null ? that.CARDNO == null : this.CARDNO.equals(that.CARDNO));
    equal = equal && (this.ACCOUNTNO == null ? that.ACCOUNTNO == null : this.ACCOUNTNO.equals(that.ACCOUNTNO));
    equal = equal && (this.CIF_ID == null ? that.CIF_ID == null : this.CIF_ID.equals(that.CIF_ID));
    equal = equal && (this.CIF_NAME == null ? that.CIF_NAME == null : this.CIF_NAME.equals(that.CIF_NAME));
    equal = equal && (this.CARDNO2 == null ? that.CARDNO2 == null : this.CARDNO2.equals(that.CARDNO2));
    equal = equal && (this.ACCOUNTNO2 == null ? that.ACCOUNTNO2 == null : this.ACCOUNTNO2.equals(that.ACCOUNTNO2));
    equal = equal && (this.CIF_ID2 == null ? that.CIF_ID2 == null : this.CIF_ID2.equals(that.CIF_ID2));
    equal = equal && (this.CIF_NAME2 == null ? that.CIF_NAME2 == null : this.CIF_NAME2.equals(that.CIF_NAME2));
    equal = equal && (this.TSPDATE == null ? that.TSPDATE == null : this.TSPDATE.equals(that.TSPDATE));
    equal = equal && (this.TSPTIME == null ? that.TSPTIME == null : this.TSPTIME.equals(that.TSPTIME));
    equal = equal && (this.HOSTDATE == null ? that.HOSTDATE == null : this.HOSTDATE.equals(that.HOSTDATE));
    equal = equal && (this.HOSTTIME == null ? that.HOSTTIME == null : this.HOSTTIME.equals(that.HOSTTIME));
    equal = equal && (this.CLIENTDATE == null ? that.CLIENTDATE == null : this.CLIENTDATE.equals(that.CLIENTDATE));
    equal = equal && (this.CLIENTTIME == null ? that.CLIENTTIME == null : this.CLIENTTIME.equals(that.CLIENTTIME));
    equal = equal && (this.DELDATE == null ? that.DELDATE == null : this.DELDATE.equals(that.DELDATE));
    equal = equal && (this.DELTIME == null ? that.DELTIME == null : this.DELTIME.equals(that.DELTIME));
    equal = equal && (this.CYCDATE == null ? that.CYCDATE == null : this.CYCDATE.equals(that.CYCDATE));
    equal = equal && (this.TSPDATE2 == null ? that.TSPDATE2 == null : this.TSPDATE2.equals(that.TSPDATE2));
    equal = equal && (this.TSPTIME2 == null ? that.TSPTIME2 == null : this.TSPTIME2.equals(that.TSPTIME2));
    equal = equal && (this.CYCDATE2 == null ? that.CYCDATE2 == null : this.CYCDATE2.equals(that.CYCDATE2));
    equal = equal && (this.TSPDATE3 == null ? that.TSPDATE3 == null : this.TSPDATE3.equals(that.TSPDATE3));
    equal = equal && (this.TSPTIME3 == null ? that.TSPTIME3 == null : this.TSPTIME3.equals(that.TSPTIME3));
    equal = equal && (this.TSPTRACENUM == null ? that.TSPTRACENUM == null : this.TSPTRACENUM.equals(that.TSPTRACENUM));
    equal = equal && (this.HOSTTRACENUM == null ? that.HOSTTRACENUM == null : this.HOSTTRACENUM.equals(that.HOSTTRACENUM));
    equal = equal && (this.CLIENTTRACENUM == null ? that.CLIENTTRACENUM == null : this.CLIENTTRACENUM.equals(that.CLIENTTRACENUM));
    equal = equal && (this.TSPTRACENUM2 == null ? that.TSPTRACENUM2 == null : this.TSPTRACENUM2.equals(that.TSPTRACENUM2));
    equal = equal && (this.HOSTTRACENUM2 == null ? that.HOSTTRACENUM2 == null : this.HOSTTRACENUM2.equals(that.HOSTTRACENUM2));
    equal = equal && (this.TSPTRACENUM3 == null ? that.TSPTRACENUM3 == null : this.TSPTRACENUM3.equals(that.TSPTRACENUM3));
    equal = equal && (this.HOSTTRACENUM3 == null ? that.HOSTTRACENUM3 == null : this.HOSTTRACENUM3.equals(that.HOSTTRACENUM3));
    equal = equal && (this.CLIENTTRACENUM3 == null ? that.CLIENTTRACENUM3 == null : this.CLIENTTRACENUM3.equals(that.CLIENTTRACENUM3));
    equal = equal && (this.TSPRETCODE == null ? that.TSPRETCODE == null : this.TSPRETCODE.equals(that.TSPRETCODE));
    equal = equal && (this.HOSTRETCODE == null ? that.HOSTRETCODE == null : this.HOSTRETCODE.equals(that.HOSTRETCODE));
    equal = equal && (this.DEVRETCODE == null ? that.DEVRETCODE == null : this.DEVRETCODE.equals(that.DEVRETCODE));
    equal = equal && (this.TRANSTAT == null ? that.TRANSTAT == null : this.TRANSTAT.equals(that.TRANSTAT));
    equal = equal && (this.ODSSTAT == null ? that.ODSSTAT == null : this.ODSSTAT.equals(that.ODSSTAT));
    equal = equal && (this.MEMO1 == null ? that.MEMO1 == null : this.MEMO1.equals(that.MEMO1));
    equal = equal && (this.MEMO2 == null ? that.MEMO2 == null : this.MEMO2.equals(that.MEMO2));
    equal = equal && (this.MEMO3 == null ? that.MEMO3 == null : this.MEMO3.equals(that.MEMO3));
    equal = equal && (this.DELCYCDATE == null ? that.DELCYCDATE == null : this.DELCYCDATE.equals(that.DELCYCDATE));
    equal = equal && (this.CLIENTDATE2 == null ? that.CLIENTDATE2 == null : this.CLIENTDATE2.equals(that.CLIENTDATE2));
    equal = equal && (this.CLIENTTIME2 == null ? that.CLIENTTIME2 == null : this.CLIENTTIME2.equals(that.CLIENTTIME2));
    equal = equal && (this.CLIENTTRACENUM2 == null ? that.CLIENTTRACENUM2 == null : this.CLIENTTRACENUM2.equals(that.CLIENTTRACENUM2));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.TX_DT = JdbcWritableBridge.readString(1, __dbResults);
    this.SOURCE_ID = JdbcWritableBridge.readString(2, __dbResults);
    this.BRANCHID = JdbcWritableBridge.readString(3, __dbResults);
    this.TELLERID = JdbcWritableBridge.readString(4, __dbResults);
    this.DEVICETYPE = JdbcWritableBridge.readString(5, __dbResults);
    this.CHNLTYPE = JdbcWritableBridge.readString(6, __dbResults);
    this.TELLERID2 = JdbcWritableBridge.readString(7, __dbResults);
    this.TSPTRANCODE = JdbcWritableBridge.readString(8, __dbResults);
    this.TRANPROCCODE = JdbcWritableBridge.readString(9, __dbResults);
    this.TRANAMT = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.TRANFEE = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.CURRENCYTYPE = JdbcWritableBridge.readString(12, __dbResults);
    this.DEVCYCLENUM = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.CARDNO = JdbcWritableBridge.readString(14, __dbResults);
    this.ACCOUNTNO = JdbcWritableBridge.readString(15, __dbResults);
    this.CIF_ID = JdbcWritableBridge.readString(16, __dbResults);
    this.CIF_NAME = JdbcWritableBridge.readString(17, __dbResults);
    this.CARDNO2 = JdbcWritableBridge.readString(18, __dbResults);
    this.ACCOUNTNO2 = JdbcWritableBridge.readString(19, __dbResults);
    this.CIF_ID2 = JdbcWritableBridge.readString(20, __dbResults);
    this.CIF_NAME2 = JdbcWritableBridge.readString(21, __dbResults);
    this.TSPDATE = JdbcWritableBridge.readString(22, __dbResults);
    this.TSPTIME = JdbcWritableBridge.readString(23, __dbResults);
    this.HOSTDATE = JdbcWritableBridge.readString(24, __dbResults);
    this.HOSTTIME = JdbcWritableBridge.readString(25, __dbResults);
    this.CLIENTDATE = JdbcWritableBridge.readString(26, __dbResults);
    this.CLIENTTIME = JdbcWritableBridge.readString(27, __dbResults);
    this.DELDATE = JdbcWritableBridge.readString(28, __dbResults);
    this.DELTIME = JdbcWritableBridge.readString(29, __dbResults);
    this.CYCDATE = JdbcWritableBridge.readString(30, __dbResults);
    this.TSPDATE2 = JdbcWritableBridge.readString(31, __dbResults);
    this.TSPTIME2 = JdbcWritableBridge.readString(32, __dbResults);
    this.CYCDATE2 = JdbcWritableBridge.readString(33, __dbResults);
    this.TSPDATE3 = JdbcWritableBridge.readString(34, __dbResults);
    this.TSPTIME3 = JdbcWritableBridge.readString(35, __dbResults);
    this.TSPTRACENUM = JdbcWritableBridge.readString(36, __dbResults);
    this.HOSTTRACENUM = JdbcWritableBridge.readString(37, __dbResults);
    this.CLIENTTRACENUM = JdbcWritableBridge.readString(38, __dbResults);
    this.TSPTRACENUM2 = JdbcWritableBridge.readString(39, __dbResults);
    this.HOSTTRACENUM2 = JdbcWritableBridge.readString(40, __dbResults);
    this.TSPTRACENUM3 = JdbcWritableBridge.readString(41, __dbResults);
    this.HOSTTRACENUM3 = JdbcWritableBridge.readString(42, __dbResults);
    this.CLIENTTRACENUM3 = JdbcWritableBridge.readString(43, __dbResults);
    this.TSPRETCODE = JdbcWritableBridge.readString(44, __dbResults);
    this.HOSTRETCODE = JdbcWritableBridge.readString(45, __dbResults);
    this.DEVRETCODE = JdbcWritableBridge.readString(46, __dbResults);
    this.TRANSTAT = JdbcWritableBridge.readString(47, __dbResults);
    this.ODSSTAT = JdbcWritableBridge.readString(48, __dbResults);
    this.MEMO1 = JdbcWritableBridge.readString(49, __dbResults);
    this.MEMO2 = JdbcWritableBridge.readString(50, __dbResults);
    this.MEMO3 = JdbcWritableBridge.readString(51, __dbResults);
    this.DELCYCDATE = JdbcWritableBridge.readString(52, __dbResults);
    this.CLIENTDATE2 = JdbcWritableBridge.readString(53, __dbResults);
    this.CLIENTTIME2 = JdbcWritableBridge.readString(54, __dbResults);
    this.CLIENTTRACENUM2 = JdbcWritableBridge.readString(55, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.TX_DT = JdbcWritableBridge.readString(1, __dbResults);
    this.SOURCE_ID = JdbcWritableBridge.readString(2, __dbResults);
    this.BRANCHID = JdbcWritableBridge.readString(3, __dbResults);
    this.TELLERID = JdbcWritableBridge.readString(4, __dbResults);
    this.DEVICETYPE = JdbcWritableBridge.readString(5, __dbResults);
    this.CHNLTYPE = JdbcWritableBridge.readString(6, __dbResults);
    this.TELLERID2 = JdbcWritableBridge.readString(7, __dbResults);
    this.TSPTRANCODE = JdbcWritableBridge.readString(8, __dbResults);
    this.TRANPROCCODE = JdbcWritableBridge.readString(9, __dbResults);
    this.TRANAMT = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.TRANFEE = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.CURRENCYTYPE = JdbcWritableBridge.readString(12, __dbResults);
    this.DEVCYCLENUM = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.CARDNO = JdbcWritableBridge.readString(14, __dbResults);
    this.ACCOUNTNO = JdbcWritableBridge.readString(15, __dbResults);
    this.CIF_ID = JdbcWritableBridge.readString(16, __dbResults);
    this.CIF_NAME = JdbcWritableBridge.readString(17, __dbResults);
    this.CARDNO2 = JdbcWritableBridge.readString(18, __dbResults);
    this.ACCOUNTNO2 = JdbcWritableBridge.readString(19, __dbResults);
    this.CIF_ID2 = JdbcWritableBridge.readString(20, __dbResults);
    this.CIF_NAME2 = JdbcWritableBridge.readString(21, __dbResults);
    this.TSPDATE = JdbcWritableBridge.readString(22, __dbResults);
    this.TSPTIME = JdbcWritableBridge.readString(23, __dbResults);
    this.HOSTDATE = JdbcWritableBridge.readString(24, __dbResults);
    this.HOSTTIME = JdbcWritableBridge.readString(25, __dbResults);
    this.CLIENTDATE = JdbcWritableBridge.readString(26, __dbResults);
    this.CLIENTTIME = JdbcWritableBridge.readString(27, __dbResults);
    this.DELDATE = JdbcWritableBridge.readString(28, __dbResults);
    this.DELTIME = JdbcWritableBridge.readString(29, __dbResults);
    this.CYCDATE = JdbcWritableBridge.readString(30, __dbResults);
    this.TSPDATE2 = JdbcWritableBridge.readString(31, __dbResults);
    this.TSPTIME2 = JdbcWritableBridge.readString(32, __dbResults);
    this.CYCDATE2 = JdbcWritableBridge.readString(33, __dbResults);
    this.TSPDATE3 = JdbcWritableBridge.readString(34, __dbResults);
    this.TSPTIME3 = JdbcWritableBridge.readString(35, __dbResults);
    this.TSPTRACENUM = JdbcWritableBridge.readString(36, __dbResults);
    this.HOSTTRACENUM = JdbcWritableBridge.readString(37, __dbResults);
    this.CLIENTTRACENUM = JdbcWritableBridge.readString(38, __dbResults);
    this.TSPTRACENUM2 = JdbcWritableBridge.readString(39, __dbResults);
    this.HOSTTRACENUM2 = JdbcWritableBridge.readString(40, __dbResults);
    this.TSPTRACENUM3 = JdbcWritableBridge.readString(41, __dbResults);
    this.HOSTTRACENUM3 = JdbcWritableBridge.readString(42, __dbResults);
    this.CLIENTTRACENUM3 = JdbcWritableBridge.readString(43, __dbResults);
    this.TSPRETCODE = JdbcWritableBridge.readString(44, __dbResults);
    this.HOSTRETCODE = JdbcWritableBridge.readString(45, __dbResults);
    this.DEVRETCODE = JdbcWritableBridge.readString(46, __dbResults);
    this.TRANSTAT = JdbcWritableBridge.readString(47, __dbResults);
    this.ODSSTAT = JdbcWritableBridge.readString(48, __dbResults);
    this.MEMO1 = JdbcWritableBridge.readString(49, __dbResults);
    this.MEMO2 = JdbcWritableBridge.readString(50, __dbResults);
    this.MEMO3 = JdbcWritableBridge.readString(51, __dbResults);
    this.DELCYCDATE = JdbcWritableBridge.readString(52, __dbResults);
    this.CLIENTDATE2 = JdbcWritableBridge.readString(53, __dbResults);
    this.CLIENTTIME2 = JdbcWritableBridge.readString(54, __dbResults);
    this.CLIENTTRACENUM2 = JdbcWritableBridge.readString(55, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(TX_DT, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SOURCE_ID, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(BRANCHID, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TELLERID, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DEVICETYPE, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CHNLTYPE, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TELLERID2, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TSPTRANCODE, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TRANPROCCODE, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TRANAMT, 10 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TRANFEE, 11 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(CURRENCYTYPE, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DEVCYCLENUM, 13 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(CARDNO, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ACCOUNTNO, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CIF_ID, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CIF_NAME, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CARDNO2, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ACCOUNTNO2, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CIF_ID2, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CIF_NAME2, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TSPDATE, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TSPTIME, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(HOSTDATE, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(HOSTTIME, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CLIENTDATE, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CLIENTTIME, 27 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DELDATE, 28 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DELTIME, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CYCDATE, 30 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TSPDATE2, 31 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TSPTIME2, 32 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CYCDATE2, 33 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TSPDATE3, 34 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TSPTIME3, 35 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TSPTRACENUM, 36 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(HOSTTRACENUM, 37 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CLIENTTRACENUM, 38 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TSPTRACENUM2, 39 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(HOSTTRACENUM2, 40 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TSPTRACENUM3, 41 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(HOSTTRACENUM3, 42 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CLIENTTRACENUM3, 43 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TSPRETCODE, 44 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(HOSTRETCODE, 45 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DEVRETCODE, 46 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TRANSTAT, 47 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ODSSTAT, 48 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MEMO1, 49 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MEMO2, 50 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MEMO3, 51 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DELCYCDATE, 52 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CLIENTDATE2, 53 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CLIENTTIME2, 54 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CLIENTTRACENUM2, 55 + __off, 12, __dbStmt);
    return 55;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(TX_DT, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SOURCE_ID, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(BRANCHID, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TELLERID, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DEVICETYPE, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CHNLTYPE, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TELLERID2, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TSPTRANCODE, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TRANPROCCODE, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TRANAMT, 10 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TRANFEE, 11 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(CURRENCYTYPE, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DEVCYCLENUM, 13 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(CARDNO, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ACCOUNTNO, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CIF_ID, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CIF_NAME, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CARDNO2, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ACCOUNTNO2, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CIF_ID2, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CIF_NAME2, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TSPDATE, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TSPTIME, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(HOSTDATE, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(HOSTTIME, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CLIENTDATE, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CLIENTTIME, 27 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DELDATE, 28 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DELTIME, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CYCDATE, 30 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TSPDATE2, 31 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TSPTIME2, 32 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CYCDATE2, 33 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TSPDATE3, 34 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TSPTIME3, 35 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TSPTRACENUM, 36 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(HOSTTRACENUM, 37 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CLIENTTRACENUM, 38 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TSPTRACENUM2, 39 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(HOSTTRACENUM2, 40 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TSPTRACENUM3, 41 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(HOSTTRACENUM3, 42 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CLIENTTRACENUM3, 43 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TSPRETCODE, 44 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(HOSTRETCODE, 45 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DEVRETCODE, 46 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TRANSTAT, 47 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ODSSTAT, 48 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MEMO1, 49 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MEMO2, 50 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MEMO3, 51 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DELCYCDATE, 52 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CLIENTDATE2, 53 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CLIENTTIME2, 54 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CLIENTTRACENUM2, 55 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.TX_DT = null;
    } else {
    this.TX_DT = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SOURCE_ID = null;
    } else {
    this.SOURCE_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BRANCHID = null;
    } else {
    this.BRANCHID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TELLERID = null;
    } else {
    this.TELLERID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DEVICETYPE = null;
    } else {
    this.DEVICETYPE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CHNLTYPE = null;
    } else {
    this.CHNLTYPE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TELLERID2 = null;
    } else {
    this.TELLERID2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TSPTRANCODE = null;
    } else {
    this.TSPTRANCODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TRANPROCCODE = null;
    } else {
    this.TRANPROCCODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TRANAMT = null;
    } else {
    this.TRANAMT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TRANFEE = null;
    } else {
    this.TRANFEE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CURRENCYTYPE = null;
    } else {
    this.CURRENCYTYPE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DEVCYCLENUM = null;
    } else {
    this.DEVCYCLENUM = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CARDNO = null;
    } else {
    this.CARDNO = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ACCOUNTNO = null;
    } else {
    this.ACCOUNTNO = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CIF_ID = null;
    } else {
    this.CIF_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CIF_NAME = null;
    } else {
    this.CIF_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CARDNO2 = null;
    } else {
    this.CARDNO2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ACCOUNTNO2 = null;
    } else {
    this.ACCOUNTNO2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CIF_ID2 = null;
    } else {
    this.CIF_ID2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CIF_NAME2 = null;
    } else {
    this.CIF_NAME2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TSPDATE = null;
    } else {
    this.TSPDATE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TSPTIME = null;
    } else {
    this.TSPTIME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HOSTDATE = null;
    } else {
    this.HOSTDATE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HOSTTIME = null;
    } else {
    this.HOSTTIME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CLIENTDATE = null;
    } else {
    this.CLIENTDATE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CLIENTTIME = null;
    } else {
    this.CLIENTTIME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DELDATE = null;
    } else {
    this.DELDATE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DELTIME = null;
    } else {
    this.DELTIME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CYCDATE = null;
    } else {
    this.CYCDATE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TSPDATE2 = null;
    } else {
    this.TSPDATE2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TSPTIME2 = null;
    } else {
    this.TSPTIME2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CYCDATE2 = null;
    } else {
    this.CYCDATE2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TSPDATE3 = null;
    } else {
    this.TSPDATE3 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TSPTIME3 = null;
    } else {
    this.TSPTIME3 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TSPTRACENUM = null;
    } else {
    this.TSPTRACENUM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HOSTTRACENUM = null;
    } else {
    this.HOSTTRACENUM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CLIENTTRACENUM = null;
    } else {
    this.CLIENTTRACENUM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TSPTRACENUM2 = null;
    } else {
    this.TSPTRACENUM2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HOSTTRACENUM2 = null;
    } else {
    this.HOSTTRACENUM2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TSPTRACENUM3 = null;
    } else {
    this.TSPTRACENUM3 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HOSTTRACENUM3 = null;
    } else {
    this.HOSTTRACENUM3 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CLIENTTRACENUM3 = null;
    } else {
    this.CLIENTTRACENUM3 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TSPRETCODE = null;
    } else {
    this.TSPRETCODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HOSTRETCODE = null;
    } else {
    this.HOSTRETCODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DEVRETCODE = null;
    } else {
    this.DEVRETCODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TRANSTAT = null;
    } else {
    this.TRANSTAT = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ODSSTAT = null;
    } else {
    this.ODSSTAT = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MEMO1 = null;
    } else {
    this.MEMO1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MEMO2 = null;
    } else {
    this.MEMO2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MEMO3 = null;
    } else {
    this.MEMO3 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DELCYCDATE = null;
    } else {
    this.DELCYCDATE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CLIENTDATE2 = null;
    } else {
    this.CLIENTDATE2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CLIENTTIME2 = null;
    } else {
    this.CLIENTTIME2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CLIENTTRACENUM2 = null;
    } else {
    this.CLIENTTRACENUM2 = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.TX_DT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TX_DT);
    }
    if (null == this.SOURCE_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SOURCE_ID);
    }
    if (null == this.BRANCHID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BRANCHID);
    }
    if (null == this.TELLERID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TELLERID);
    }
    if (null == this.DEVICETYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DEVICETYPE);
    }
    if (null == this.CHNLTYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CHNLTYPE);
    }
    if (null == this.TELLERID2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TELLERID2);
    }
    if (null == this.TSPTRANCODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TSPTRANCODE);
    }
    if (null == this.TRANPROCCODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TRANPROCCODE);
    }
    if (null == this.TRANAMT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TRANAMT, __dataOut);
    }
    if (null == this.TRANFEE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TRANFEE, __dataOut);
    }
    if (null == this.CURRENCYTYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CURRENCYTYPE);
    }
    if (null == this.DEVCYCLENUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DEVCYCLENUM, __dataOut);
    }
    if (null == this.CARDNO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CARDNO);
    }
    if (null == this.ACCOUNTNO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ACCOUNTNO);
    }
    if (null == this.CIF_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CIF_ID);
    }
    if (null == this.CIF_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CIF_NAME);
    }
    if (null == this.CARDNO2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CARDNO2);
    }
    if (null == this.ACCOUNTNO2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ACCOUNTNO2);
    }
    if (null == this.CIF_ID2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CIF_ID2);
    }
    if (null == this.CIF_NAME2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CIF_NAME2);
    }
    if (null == this.TSPDATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TSPDATE);
    }
    if (null == this.TSPTIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TSPTIME);
    }
    if (null == this.HOSTDATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HOSTDATE);
    }
    if (null == this.HOSTTIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HOSTTIME);
    }
    if (null == this.CLIENTDATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CLIENTDATE);
    }
    if (null == this.CLIENTTIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CLIENTTIME);
    }
    if (null == this.DELDATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DELDATE);
    }
    if (null == this.DELTIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DELTIME);
    }
    if (null == this.CYCDATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CYCDATE);
    }
    if (null == this.TSPDATE2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TSPDATE2);
    }
    if (null == this.TSPTIME2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TSPTIME2);
    }
    if (null == this.CYCDATE2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CYCDATE2);
    }
    if (null == this.TSPDATE3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TSPDATE3);
    }
    if (null == this.TSPTIME3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TSPTIME3);
    }
    if (null == this.TSPTRACENUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TSPTRACENUM);
    }
    if (null == this.HOSTTRACENUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HOSTTRACENUM);
    }
    if (null == this.CLIENTTRACENUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CLIENTTRACENUM);
    }
    if (null == this.TSPTRACENUM2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TSPTRACENUM2);
    }
    if (null == this.HOSTTRACENUM2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HOSTTRACENUM2);
    }
    if (null == this.TSPTRACENUM3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TSPTRACENUM3);
    }
    if (null == this.HOSTTRACENUM3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HOSTTRACENUM3);
    }
    if (null == this.CLIENTTRACENUM3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CLIENTTRACENUM3);
    }
    if (null == this.TSPRETCODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TSPRETCODE);
    }
    if (null == this.HOSTRETCODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HOSTRETCODE);
    }
    if (null == this.DEVRETCODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DEVRETCODE);
    }
    if (null == this.TRANSTAT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TRANSTAT);
    }
    if (null == this.ODSSTAT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ODSSTAT);
    }
    if (null == this.MEMO1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MEMO1);
    }
    if (null == this.MEMO2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MEMO2);
    }
    if (null == this.MEMO3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MEMO3);
    }
    if (null == this.DELCYCDATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DELCYCDATE);
    }
    if (null == this.CLIENTDATE2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CLIENTDATE2);
    }
    if (null == this.CLIENTTIME2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CLIENTTIME2);
    }
    if (null == this.CLIENTTRACENUM2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CLIENTTRACENUM2);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.TX_DT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TX_DT);
    }
    if (null == this.SOURCE_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SOURCE_ID);
    }
    if (null == this.BRANCHID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BRANCHID);
    }
    if (null == this.TELLERID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TELLERID);
    }
    if (null == this.DEVICETYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DEVICETYPE);
    }
    if (null == this.CHNLTYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CHNLTYPE);
    }
    if (null == this.TELLERID2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TELLERID2);
    }
    if (null == this.TSPTRANCODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TSPTRANCODE);
    }
    if (null == this.TRANPROCCODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TRANPROCCODE);
    }
    if (null == this.TRANAMT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TRANAMT, __dataOut);
    }
    if (null == this.TRANFEE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TRANFEE, __dataOut);
    }
    if (null == this.CURRENCYTYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CURRENCYTYPE);
    }
    if (null == this.DEVCYCLENUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DEVCYCLENUM, __dataOut);
    }
    if (null == this.CARDNO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CARDNO);
    }
    if (null == this.ACCOUNTNO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ACCOUNTNO);
    }
    if (null == this.CIF_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CIF_ID);
    }
    if (null == this.CIF_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CIF_NAME);
    }
    if (null == this.CARDNO2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CARDNO2);
    }
    if (null == this.ACCOUNTNO2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ACCOUNTNO2);
    }
    if (null == this.CIF_ID2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CIF_ID2);
    }
    if (null == this.CIF_NAME2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CIF_NAME2);
    }
    if (null == this.TSPDATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TSPDATE);
    }
    if (null == this.TSPTIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TSPTIME);
    }
    if (null == this.HOSTDATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HOSTDATE);
    }
    if (null == this.HOSTTIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HOSTTIME);
    }
    if (null == this.CLIENTDATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CLIENTDATE);
    }
    if (null == this.CLIENTTIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CLIENTTIME);
    }
    if (null == this.DELDATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DELDATE);
    }
    if (null == this.DELTIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DELTIME);
    }
    if (null == this.CYCDATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CYCDATE);
    }
    if (null == this.TSPDATE2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TSPDATE2);
    }
    if (null == this.TSPTIME2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TSPTIME2);
    }
    if (null == this.CYCDATE2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CYCDATE2);
    }
    if (null == this.TSPDATE3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TSPDATE3);
    }
    if (null == this.TSPTIME3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TSPTIME3);
    }
    if (null == this.TSPTRACENUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TSPTRACENUM);
    }
    if (null == this.HOSTTRACENUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HOSTTRACENUM);
    }
    if (null == this.CLIENTTRACENUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CLIENTTRACENUM);
    }
    if (null == this.TSPTRACENUM2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TSPTRACENUM2);
    }
    if (null == this.HOSTTRACENUM2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HOSTTRACENUM2);
    }
    if (null == this.TSPTRACENUM3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TSPTRACENUM3);
    }
    if (null == this.HOSTTRACENUM3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HOSTTRACENUM3);
    }
    if (null == this.CLIENTTRACENUM3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CLIENTTRACENUM3);
    }
    if (null == this.TSPRETCODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TSPRETCODE);
    }
    if (null == this.HOSTRETCODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HOSTRETCODE);
    }
    if (null == this.DEVRETCODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DEVRETCODE);
    }
    if (null == this.TRANSTAT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TRANSTAT);
    }
    if (null == this.ODSSTAT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ODSSTAT);
    }
    if (null == this.MEMO1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MEMO1);
    }
    if (null == this.MEMO2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MEMO2);
    }
    if (null == this.MEMO3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MEMO3);
    }
    if (null == this.DELCYCDATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DELCYCDATE);
    }
    if (null == this.CLIENTDATE2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CLIENTDATE2);
    }
    if (null == this.CLIENTTIME2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CLIENTTIME2);
    }
    if (null == this.CLIENTTRACENUM2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CLIENTTRACENUM2);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 9, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(TX_DT==null?"\\N":TX_DT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SOURCE_ID==null?"\\N":SOURCE_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BRANCHID==null?"\\N":BRANCHID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TELLERID==null?"\\N":TELLERID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DEVICETYPE==null?"\\N":DEVICETYPE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CHNLTYPE==null?"\\N":CHNLTYPE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TELLERID2==null?"\\N":TELLERID2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TSPTRANCODE==null?"\\N":TSPTRANCODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TRANPROCCODE==null?"\\N":TRANPROCCODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TRANAMT==null?"\\N":TRANAMT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TRANFEE==null?"\\N":TRANFEE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CURRENCYTYPE==null?"\\N":CURRENCYTYPE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DEVCYCLENUM==null?"\\N":DEVCYCLENUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CARDNO==null?"\\N":CARDNO, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ACCOUNTNO==null?"\\N":ACCOUNTNO, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CIF_ID==null?"\\N":CIF_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CIF_NAME==null?"\\N":CIF_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CARDNO2==null?"\\N":CARDNO2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ACCOUNTNO2==null?"\\N":ACCOUNTNO2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CIF_ID2==null?"\\N":CIF_ID2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CIF_NAME2==null?"\\N":CIF_NAME2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TSPDATE==null?"\\N":TSPDATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TSPTIME==null?"\\N":TSPTIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOSTDATE==null?"\\N":HOSTDATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOSTTIME==null?"\\N":HOSTTIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CLIENTDATE==null?"\\N":CLIENTDATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CLIENTTIME==null?"\\N":CLIENTTIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DELDATE==null?"\\N":DELDATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DELTIME==null?"\\N":DELTIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CYCDATE==null?"\\N":CYCDATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TSPDATE2==null?"\\N":TSPDATE2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TSPTIME2==null?"\\N":TSPTIME2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CYCDATE2==null?"\\N":CYCDATE2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TSPDATE3==null?"\\N":TSPDATE3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TSPTIME3==null?"\\N":TSPTIME3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TSPTRACENUM==null?"\\N":TSPTRACENUM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOSTTRACENUM==null?"\\N":HOSTTRACENUM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CLIENTTRACENUM==null?"\\N":CLIENTTRACENUM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TSPTRACENUM2==null?"\\N":TSPTRACENUM2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOSTTRACENUM2==null?"\\N":HOSTTRACENUM2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TSPTRACENUM3==null?"\\N":TSPTRACENUM3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOSTTRACENUM3==null?"\\N":HOSTTRACENUM3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CLIENTTRACENUM3==null?"\\N":CLIENTTRACENUM3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TSPRETCODE==null?"\\N":TSPRETCODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOSTRETCODE==null?"\\N":HOSTRETCODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DEVRETCODE==null?"\\N":DEVRETCODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TRANSTAT==null?"\\N":TRANSTAT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ODSSTAT==null?"\\N":ODSSTAT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MEMO1==null?"\\N":MEMO1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MEMO2==null?"\\N":MEMO2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MEMO3==null?"\\N":MEMO3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DELCYCDATE==null?"\\N":DELCYCDATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CLIENTDATE2==null?"\\N":CLIENTDATE2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CLIENTTIME2==null?"\\N":CLIENTTIME2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CLIENTTRACENUM2==null?"\\N":CLIENTTRACENUM2, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(TX_DT==null?"\\N":TX_DT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SOURCE_ID==null?"\\N":SOURCE_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BRANCHID==null?"\\N":BRANCHID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TELLERID==null?"\\N":TELLERID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DEVICETYPE==null?"\\N":DEVICETYPE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CHNLTYPE==null?"\\N":CHNLTYPE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TELLERID2==null?"\\N":TELLERID2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TSPTRANCODE==null?"\\N":TSPTRANCODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TRANPROCCODE==null?"\\N":TRANPROCCODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TRANAMT==null?"\\N":TRANAMT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TRANFEE==null?"\\N":TRANFEE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CURRENCYTYPE==null?"\\N":CURRENCYTYPE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DEVCYCLENUM==null?"\\N":DEVCYCLENUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CARDNO==null?"\\N":CARDNO, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ACCOUNTNO==null?"\\N":ACCOUNTNO, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CIF_ID==null?"\\N":CIF_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CIF_NAME==null?"\\N":CIF_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CARDNO2==null?"\\N":CARDNO2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ACCOUNTNO2==null?"\\N":ACCOUNTNO2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CIF_ID2==null?"\\N":CIF_ID2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CIF_NAME2==null?"\\N":CIF_NAME2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TSPDATE==null?"\\N":TSPDATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TSPTIME==null?"\\N":TSPTIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOSTDATE==null?"\\N":HOSTDATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOSTTIME==null?"\\N":HOSTTIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CLIENTDATE==null?"\\N":CLIENTDATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CLIENTTIME==null?"\\N":CLIENTTIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DELDATE==null?"\\N":DELDATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DELTIME==null?"\\N":DELTIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CYCDATE==null?"\\N":CYCDATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TSPDATE2==null?"\\N":TSPDATE2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TSPTIME2==null?"\\N":TSPTIME2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CYCDATE2==null?"\\N":CYCDATE2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TSPDATE3==null?"\\N":TSPDATE3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TSPTIME3==null?"\\N":TSPTIME3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TSPTRACENUM==null?"\\N":TSPTRACENUM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOSTTRACENUM==null?"\\N":HOSTTRACENUM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CLIENTTRACENUM==null?"\\N":CLIENTTRACENUM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TSPTRACENUM2==null?"\\N":TSPTRACENUM2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOSTTRACENUM2==null?"\\N":HOSTTRACENUM2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TSPTRACENUM3==null?"\\N":TSPTRACENUM3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOSTTRACENUM3==null?"\\N":HOSTTRACENUM3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CLIENTTRACENUM3==null?"\\N":CLIENTTRACENUM3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TSPRETCODE==null?"\\N":TSPRETCODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOSTRETCODE==null?"\\N":HOSTRETCODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DEVRETCODE==null?"\\N":DEVRETCODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TRANSTAT==null?"\\N":TRANSTAT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ODSSTAT==null?"\\N":ODSSTAT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MEMO1==null?"\\N":MEMO1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MEMO2==null?"\\N":MEMO2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MEMO3==null?"\\N":MEMO3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DELCYCDATE==null?"\\N":DELCYCDATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CLIENTDATE2==null?"\\N":CLIENTDATE2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CLIENTTIME2==null?"\\N":CLIENTTIME2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CLIENTTRACENUM2==null?"\\N":CLIENTTRACENUM2, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 9, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TX_DT = null; } else {
      this.TX_DT = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SOURCE_ID = null; } else {
      this.SOURCE_ID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BRANCHID = null; } else {
      this.BRANCHID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TELLERID = null; } else {
      this.TELLERID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DEVICETYPE = null; } else {
      this.DEVICETYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CHNLTYPE = null; } else {
      this.CHNLTYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TELLERID2 = null; } else {
      this.TELLERID2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TSPTRANCODE = null; } else {
      this.TSPTRANCODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TRANPROCCODE = null; } else {
      this.TRANPROCCODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TRANAMT = null; } else {
      this.TRANAMT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TRANFEE = null; } else {
      this.TRANFEE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CURRENCYTYPE = null; } else {
      this.CURRENCYTYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DEVCYCLENUM = null; } else {
      this.DEVCYCLENUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CARDNO = null; } else {
      this.CARDNO = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ACCOUNTNO = null; } else {
      this.ACCOUNTNO = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CIF_ID = null; } else {
      this.CIF_ID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CIF_NAME = null; } else {
      this.CIF_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CARDNO2 = null; } else {
      this.CARDNO2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ACCOUNTNO2 = null; } else {
      this.ACCOUNTNO2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CIF_ID2 = null; } else {
      this.CIF_ID2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CIF_NAME2 = null; } else {
      this.CIF_NAME2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TSPDATE = null; } else {
      this.TSPDATE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TSPTIME = null; } else {
      this.TSPTIME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.HOSTDATE = null; } else {
      this.HOSTDATE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.HOSTTIME = null; } else {
      this.HOSTTIME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CLIENTDATE = null; } else {
      this.CLIENTDATE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CLIENTTIME = null; } else {
      this.CLIENTTIME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DELDATE = null; } else {
      this.DELDATE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DELTIME = null; } else {
      this.DELTIME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CYCDATE = null; } else {
      this.CYCDATE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TSPDATE2 = null; } else {
      this.TSPDATE2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TSPTIME2 = null; } else {
      this.TSPTIME2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CYCDATE2 = null; } else {
      this.CYCDATE2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TSPDATE3 = null; } else {
      this.TSPDATE3 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TSPTIME3 = null; } else {
      this.TSPTIME3 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TSPTRACENUM = null; } else {
      this.TSPTRACENUM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.HOSTTRACENUM = null; } else {
      this.HOSTTRACENUM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CLIENTTRACENUM = null; } else {
      this.CLIENTTRACENUM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TSPTRACENUM2 = null; } else {
      this.TSPTRACENUM2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.HOSTTRACENUM2 = null; } else {
      this.HOSTTRACENUM2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TSPTRACENUM3 = null; } else {
      this.TSPTRACENUM3 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.HOSTTRACENUM3 = null; } else {
      this.HOSTTRACENUM3 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CLIENTTRACENUM3 = null; } else {
      this.CLIENTTRACENUM3 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TSPRETCODE = null; } else {
      this.TSPRETCODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.HOSTRETCODE = null; } else {
      this.HOSTRETCODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DEVRETCODE = null; } else {
      this.DEVRETCODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TRANSTAT = null; } else {
      this.TRANSTAT = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ODSSTAT = null; } else {
      this.ODSSTAT = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MEMO1 = null; } else {
      this.MEMO1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MEMO2 = null; } else {
      this.MEMO2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MEMO3 = null; } else {
      this.MEMO3 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DELCYCDATE = null; } else {
      this.DELCYCDATE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CLIENTDATE2 = null; } else {
      this.CLIENTDATE2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CLIENTTIME2 = null; } else {
      this.CLIENTTIME2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CLIENTTRACENUM2 = null; } else {
      this.CLIENTTRACENUM2 = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TX_DT = null; } else {
      this.TX_DT = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SOURCE_ID = null; } else {
      this.SOURCE_ID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BRANCHID = null; } else {
      this.BRANCHID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TELLERID = null; } else {
      this.TELLERID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DEVICETYPE = null; } else {
      this.DEVICETYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CHNLTYPE = null; } else {
      this.CHNLTYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TELLERID2 = null; } else {
      this.TELLERID2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TSPTRANCODE = null; } else {
      this.TSPTRANCODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TRANPROCCODE = null; } else {
      this.TRANPROCCODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TRANAMT = null; } else {
      this.TRANAMT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TRANFEE = null; } else {
      this.TRANFEE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CURRENCYTYPE = null; } else {
      this.CURRENCYTYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DEVCYCLENUM = null; } else {
      this.DEVCYCLENUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CARDNO = null; } else {
      this.CARDNO = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ACCOUNTNO = null; } else {
      this.ACCOUNTNO = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CIF_ID = null; } else {
      this.CIF_ID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CIF_NAME = null; } else {
      this.CIF_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CARDNO2 = null; } else {
      this.CARDNO2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ACCOUNTNO2 = null; } else {
      this.ACCOUNTNO2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CIF_ID2 = null; } else {
      this.CIF_ID2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CIF_NAME2 = null; } else {
      this.CIF_NAME2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TSPDATE = null; } else {
      this.TSPDATE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TSPTIME = null; } else {
      this.TSPTIME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.HOSTDATE = null; } else {
      this.HOSTDATE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.HOSTTIME = null; } else {
      this.HOSTTIME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CLIENTDATE = null; } else {
      this.CLIENTDATE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CLIENTTIME = null; } else {
      this.CLIENTTIME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DELDATE = null; } else {
      this.DELDATE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DELTIME = null; } else {
      this.DELTIME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CYCDATE = null; } else {
      this.CYCDATE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TSPDATE2 = null; } else {
      this.TSPDATE2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TSPTIME2 = null; } else {
      this.TSPTIME2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CYCDATE2 = null; } else {
      this.CYCDATE2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TSPDATE3 = null; } else {
      this.TSPDATE3 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TSPTIME3 = null; } else {
      this.TSPTIME3 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TSPTRACENUM = null; } else {
      this.TSPTRACENUM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.HOSTTRACENUM = null; } else {
      this.HOSTTRACENUM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CLIENTTRACENUM = null; } else {
      this.CLIENTTRACENUM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TSPTRACENUM2 = null; } else {
      this.TSPTRACENUM2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.HOSTTRACENUM2 = null; } else {
      this.HOSTTRACENUM2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TSPTRACENUM3 = null; } else {
      this.TSPTRACENUM3 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.HOSTTRACENUM3 = null; } else {
      this.HOSTTRACENUM3 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CLIENTTRACENUM3 = null; } else {
      this.CLIENTTRACENUM3 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TSPRETCODE = null; } else {
      this.TSPRETCODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.HOSTRETCODE = null; } else {
      this.HOSTRETCODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DEVRETCODE = null; } else {
      this.DEVRETCODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TRANSTAT = null; } else {
      this.TRANSTAT = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ODSSTAT = null; } else {
      this.ODSSTAT = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MEMO1 = null; } else {
      this.MEMO1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MEMO2 = null; } else {
      this.MEMO2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MEMO3 = null; } else {
      this.MEMO3 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DELCYCDATE = null; } else {
      this.DELCYCDATE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CLIENTDATE2 = null; } else {
      this.CLIENTDATE2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CLIENTTIME2 = null; } else {
      this.CLIENTTIME2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CLIENTTRACENUM2 = null; } else {
      this.CLIENTTRACENUM2 = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    BQD_ODS_TEST_ATMP_ACCTTRFTMP o = (BQD_ODS_TEST_ATMP_ACCTTRFTMP) super.clone();
    return o;
  }

  public void clone0(BQD_ODS_TEST_ATMP_ACCTTRFTMP o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("TX_DT", this.TX_DT);
    __sqoop$field_map.put("SOURCE_ID", this.SOURCE_ID);
    __sqoop$field_map.put("BRANCHID", this.BRANCHID);
    __sqoop$field_map.put("TELLERID", this.TELLERID);
    __sqoop$field_map.put("DEVICETYPE", this.DEVICETYPE);
    __sqoop$field_map.put("CHNLTYPE", this.CHNLTYPE);
    __sqoop$field_map.put("TELLERID2", this.TELLERID2);
    __sqoop$field_map.put("TSPTRANCODE", this.TSPTRANCODE);
    __sqoop$field_map.put("TRANPROCCODE", this.TRANPROCCODE);
    __sqoop$field_map.put("TRANAMT", this.TRANAMT);
    __sqoop$field_map.put("TRANFEE", this.TRANFEE);
    __sqoop$field_map.put("CURRENCYTYPE", this.CURRENCYTYPE);
    __sqoop$field_map.put("DEVCYCLENUM", this.DEVCYCLENUM);
    __sqoop$field_map.put("CARDNO", this.CARDNO);
    __sqoop$field_map.put("ACCOUNTNO", this.ACCOUNTNO);
    __sqoop$field_map.put("CIF_ID", this.CIF_ID);
    __sqoop$field_map.put("CIF_NAME", this.CIF_NAME);
    __sqoop$field_map.put("CARDNO2", this.CARDNO2);
    __sqoop$field_map.put("ACCOUNTNO2", this.ACCOUNTNO2);
    __sqoop$field_map.put("CIF_ID2", this.CIF_ID2);
    __sqoop$field_map.put("CIF_NAME2", this.CIF_NAME2);
    __sqoop$field_map.put("TSPDATE", this.TSPDATE);
    __sqoop$field_map.put("TSPTIME", this.TSPTIME);
    __sqoop$field_map.put("HOSTDATE", this.HOSTDATE);
    __sqoop$field_map.put("HOSTTIME", this.HOSTTIME);
    __sqoop$field_map.put("CLIENTDATE", this.CLIENTDATE);
    __sqoop$field_map.put("CLIENTTIME", this.CLIENTTIME);
    __sqoop$field_map.put("DELDATE", this.DELDATE);
    __sqoop$field_map.put("DELTIME", this.DELTIME);
    __sqoop$field_map.put("CYCDATE", this.CYCDATE);
    __sqoop$field_map.put("TSPDATE2", this.TSPDATE2);
    __sqoop$field_map.put("TSPTIME2", this.TSPTIME2);
    __sqoop$field_map.put("CYCDATE2", this.CYCDATE2);
    __sqoop$field_map.put("TSPDATE3", this.TSPDATE3);
    __sqoop$field_map.put("TSPTIME3", this.TSPTIME3);
    __sqoop$field_map.put("TSPTRACENUM", this.TSPTRACENUM);
    __sqoop$field_map.put("HOSTTRACENUM", this.HOSTTRACENUM);
    __sqoop$field_map.put("CLIENTTRACENUM", this.CLIENTTRACENUM);
    __sqoop$field_map.put("TSPTRACENUM2", this.TSPTRACENUM2);
    __sqoop$field_map.put("HOSTTRACENUM2", this.HOSTTRACENUM2);
    __sqoop$field_map.put("TSPTRACENUM3", this.TSPTRACENUM3);
    __sqoop$field_map.put("HOSTTRACENUM3", this.HOSTTRACENUM3);
    __sqoop$field_map.put("CLIENTTRACENUM3", this.CLIENTTRACENUM3);
    __sqoop$field_map.put("TSPRETCODE", this.TSPRETCODE);
    __sqoop$field_map.put("HOSTRETCODE", this.HOSTRETCODE);
    __sqoop$field_map.put("DEVRETCODE", this.DEVRETCODE);
    __sqoop$field_map.put("TRANSTAT", this.TRANSTAT);
    __sqoop$field_map.put("ODSSTAT", this.ODSSTAT);
    __sqoop$field_map.put("MEMO1", this.MEMO1);
    __sqoop$field_map.put("MEMO2", this.MEMO2);
    __sqoop$field_map.put("MEMO3", this.MEMO3);
    __sqoop$field_map.put("DELCYCDATE", this.DELCYCDATE);
    __sqoop$field_map.put("CLIENTDATE2", this.CLIENTDATE2);
    __sqoop$field_map.put("CLIENTTIME2", this.CLIENTTIME2);
    __sqoop$field_map.put("CLIENTTRACENUM2", this.CLIENTTRACENUM2);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("TX_DT", this.TX_DT);
    __sqoop$field_map.put("SOURCE_ID", this.SOURCE_ID);
    __sqoop$field_map.put("BRANCHID", this.BRANCHID);
    __sqoop$field_map.put("TELLERID", this.TELLERID);
    __sqoop$field_map.put("DEVICETYPE", this.DEVICETYPE);
    __sqoop$field_map.put("CHNLTYPE", this.CHNLTYPE);
    __sqoop$field_map.put("TELLERID2", this.TELLERID2);
    __sqoop$field_map.put("TSPTRANCODE", this.TSPTRANCODE);
    __sqoop$field_map.put("TRANPROCCODE", this.TRANPROCCODE);
    __sqoop$field_map.put("TRANAMT", this.TRANAMT);
    __sqoop$field_map.put("TRANFEE", this.TRANFEE);
    __sqoop$field_map.put("CURRENCYTYPE", this.CURRENCYTYPE);
    __sqoop$field_map.put("DEVCYCLENUM", this.DEVCYCLENUM);
    __sqoop$field_map.put("CARDNO", this.CARDNO);
    __sqoop$field_map.put("ACCOUNTNO", this.ACCOUNTNO);
    __sqoop$field_map.put("CIF_ID", this.CIF_ID);
    __sqoop$field_map.put("CIF_NAME", this.CIF_NAME);
    __sqoop$field_map.put("CARDNO2", this.CARDNO2);
    __sqoop$field_map.put("ACCOUNTNO2", this.ACCOUNTNO2);
    __sqoop$field_map.put("CIF_ID2", this.CIF_ID2);
    __sqoop$field_map.put("CIF_NAME2", this.CIF_NAME2);
    __sqoop$field_map.put("TSPDATE", this.TSPDATE);
    __sqoop$field_map.put("TSPTIME", this.TSPTIME);
    __sqoop$field_map.put("HOSTDATE", this.HOSTDATE);
    __sqoop$field_map.put("HOSTTIME", this.HOSTTIME);
    __sqoop$field_map.put("CLIENTDATE", this.CLIENTDATE);
    __sqoop$field_map.put("CLIENTTIME", this.CLIENTTIME);
    __sqoop$field_map.put("DELDATE", this.DELDATE);
    __sqoop$field_map.put("DELTIME", this.DELTIME);
    __sqoop$field_map.put("CYCDATE", this.CYCDATE);
    __sqoop$field_map.put("TSPDATE2", this.TSPDATE2);
    __sqoop$field_map.put("TSPTIME2", this.TSPTIME2);
    __sqoop$field_map.put("CYCDATE2", this.CYCDATE2);
    __sqoop$field_map.put("TSPDATE3", this.TSPDATE3);
    __sqoop$field_map.put("TSPTIME3", this.TSPTIME3);
    __sqoop$field_map.put("TSPTRACENUM", this.TSPTRACENUM);
    __sqoop$field_map.put("HOSTTRACENUM", this.HOSTTRACENUM);
    __sqoop$field_map.put("CLIENTTRACENUM", this.CLIENTTRACENUM);
    __sqoop$field_map.put("TSPTRACENUM2", this.TSPTRACENUM2);
    __sqoop$field_map.put("HOSTTRACENUM2", this.HOSTTRACENUM2);
    __sqoop$field_map.put("TSPTRACENUM3", this.TSPTRACENUM3);
    __sqoop$field_map.put("HOSTTRACENUM3", this.HOSTTRACENUM3);
    __sqoop$field_map.put("CLIENTTRACENUM3", this.CLIENTTRACENUM3);
    __sqoop$field_map.put("TSPRETCODE", this.TSPRETCODE);
    __sqoop$field_map.put("HOSTRETCODE", this.HOSTRETCODE);
    __sqoop$field_map.put("DEVRETCODE", this.DEVRETCODE);
    __sqoop$field_map.put("TRANSTAT", this.TRANSTAT);
    __sqoop$field_map.put("ODSSTAT", this.ODSSTAT);
    __sqoop$field_map.put("MEMO1", this.MEMO1);
    __sqoop$field_map.put("MEMO2", this.MEMO2);
    __sqoop$field_map.put("MEMO3", this.MEMO3);
    __sqoop$field_map.put("DELCYCDATE", this.DELCYCDATE);
    __sqoop$field_map.put("CLIENTDATE2", this.CLIENTDATE2);
    __sqoop$field_map.put("CLIENTTIME2", this.CLIENTTIME2);
    __sqoop$field_map.put("CLIENTTRACENUM2", this.CLIENTTRACENUM2);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("TX_DT".equals(__fieldName)) {
      this.TX_DT = (String) __fieldVal;
    }
    else    if ("SOURCE_ID".equals(__fieldName)) {
      this.SOURCE_ID = (String) __fieldVal;
    }
    else    if ("BRANCHID".equals(__fieldName)) {
      this.BRANCHID = (String) __fieldVal;
    }
    else    if ("TELLERID".equals(__fieldName)) {
      this.TELLERID = (String) __fieldVal;
    }
    else    if ("DEVICETYPE".equals(__fieldName)) {
      this.DEVICETYPE = (String) __fieldVal;
    }
    else    if ("CHNLTYPE".equals(__fieldName)) {
      this.CHNLTYPE = (String) __fieldVal;
    }
    else    if ("TELLERID2".equals(__fieldName)) {
      this.TELLERID2 = (String) __fieldVal;
    }
    else    if ("TSPTRANCODE".equals(__fieldName)) {
      this.TSPTRANCODE = (String) __fieldVal;
    }
    else    if ("TRANPROCCODE".equals(__fieldName)) {
      this.TRANPROCCODE = (String) __fieldVal;
    }
    else    if ("TRANAMT".equals(__fieldName)) {
      this.TRANAMT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("TRANFEE".equals(__fieldName)) {
      this.TRANFEE = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("CURRENCYTYPE".equals(__fieldName)) {
      this.CURRENCYTYPE = (String) __fieldVal;
    }
    else    if ("DEVCYCLENUM".equals(__fieldName)) {
      this.DEVCYCLENUM = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("CARDNO".equals(__fieldName)) {
      this.CARDNO = (String) __fieldVal;
    }
    else    if ("ACCOUNTNO".equals(__fieldName)) {
      this.ACCOUNTNO = (String) __fieldVal;
    }
    else    if ("CIF_ID".equals(__fieldName)) {
      this.CIF_ID = (String) __fieldVal;
    }
    else    if ("CIF_NAME".equals(__fieldName)) {
      this.CIF_NAME = (String) __fieldVal;
    }
    else    if ("CARDNO2".equals(__fieldName)) {
      this.CARDNO2 = (String) __fieldVal;
    }
    else    if ("ACCOUNTNO2".equals(__fieldName)) {
      this.ACCOUNTNO2 = (String) __fieldVal;
    }
    else    if ("CIF_ID2".equals(__fieldName)) {
      this.CIF_ID2 = (String) __fieldVal;
    }
    else    if ("CIF_NAME2".equals(__fieldName)) {
      this.CIF_NAME2 = (String) __fieldVal;
    }
    else    if ("TSPDATE".equals(__fieldName)) {
      this.TSPDATE = (String) __fieldVal;
    }
    else    if ("TSPTIME".equals(__fieldName)) {
      this.TSPTIME = (String) __fieldVal;
    }
    else    if ("HOSTDATE".equals(__fieldName)) {
      this.HOSTDATE = (String) __fieldVal;
    }
    else    if ("HOSTTIME".equals(__fieldName)) {
      this.HOSTTIME = (String) __fieldVal;
    }
    else    if ("CLIENTDATE".equals(__fieldName)) {
      this.CLIENTDATE = (String) __fieldVal;
    }
    else    if ("CLIENTTIME".equals(__fieldName)) {
      this.CLIENTTIME = (String) __fieldVal;
    }
    else    if ("DELDATE".equals(__fieldName)) {
      this.DELDATE = (String) __fieldVal;
    }
    else    if ("DELTIME".equals(__fieldName)) {
      this.DELTIME = (String) __fieldVal;
    }
    else    if ("CYCDATE".equals(__fieldName)) {
      this.CYCDATE = (String) __fieldVal;
    }
    else    if ("TSPDATE2".equals(__fieldName)) {
      this.TSPDATE2 = (String) __fieldVal;
    }
    else    if ("TSPTIME2".equals(__fieldName)) {
      this.TSPTIME2 = (String) __fieldVal;
    }
    else    if ("CYCDATE2".equals(__fieldName)) {
      this.CYCDATE2 = (String) __fieldVal;
    }
    else    if ("TSPDATE3".equals(__fieldName)) {
      this.TSPDATE3 = (String) __fieldVal;
    }
    else    if ("TSPTIME3".equals(__fieldName)) {
      this.TSPTIME3 = (String) __fieldVal;
    }
    else    if ("TSPTRACENUM".equals(__fieldName)) {
      this.TSPTRACENUM = (String) __fieldVal;
    }
    else    if ("HOSTTRACENUM".equals(__fieldName)) {
      this.HOSTTRACENUM = (String) __fieldVal;
    }
    else    if ("CLIENTTRACENUM".equals(__fieldName)) {
      this.CLIENTTRACENUM = (String) __fieldVal;
    }
    else    if ("TSPTRACENUM2".equals(__fieldName)) {
      this.TSPTRACENUM2 = (String) __fieldVal;
    }
    else    if ("HOSTTRACENUM2".equals(__fieldName)) {
      this.HOSTTRACENUM2 = (String) __fieldVal;
    }
    else    if ("TSPTRACENUM3".equals(__fieldName)) {
      this.TSPTRACENUM3 = (String) __fieldVal;
    }
    else    if ("HOSTTRACENUM3".equals(__fieldName)) {
      this.HOSTTRACENUM3 = (String) __fieldVal;
    }
    else    if ("CLIENTTRACENUM3".equals(__fieldName)) {
      this.CLIENTTRACENUM3 = (String) __fieldVal;
    }
    else    if ("TSPRETCODE".equals(__fieldName)) {
      this.TSPRETCODE = (String) __fieldVal;
    }
    else    if ("HOSTRETCODE".equals(__fieldName)) {
      this.HOSTRETCODE = (String) __fieldVal;
    }
    else    if ("DEVRETCODE".equals(__fieldName)) {
      this.DEVRETCODE = (String) __fieldVal;
    }
    else    if ("TRANSTAT".equals(__fieldName)) {
      this.TRANSTAT = (String) __fieldVal;
    }
    else    if ("ODSSTAT".equals(__fieldName)) {
      this.ODSSTAT = (String) __fieldVal;
    }
    else    if ("MEMO1".equals(__fieldName)) {
      this.MEMO1 = (String) __fieldVal;
    }
    else    if ("MEMO2".equals(__fieldName)) {
      this.MEMO2 = (String) __fieldVal;
    }
    else    if ("MEMO3".equals(__fieldName)) {
      this.MEMO3 = (String) __fieldVal;
    }
    else    if ("DELCYCDATE".equals(__fieldName)) {
      this.DELCYCDATE = (String) __fieldVal;
    }
    else    if ("CLIENTDATE2".equals(__fieldName)) {
      this.CLIENTDATE2 = (String) __fieldVal;
    }
    else    if ("CLIENTTIME2".equals(__fieldName)) {
      this.CLIENTTIME2 = (String) __fieldVal;
    }
    else    if ("CLIENTTRACENUM2".equals(__fieldName)) {
      this.CLIENTTRACENUM2 = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("TX_DT".equals(__fieldName)) {
      this.TX_DT = (String) __fieldVal;
      return true;
    }
    else    if ("SOURCE_ID".equals(__fieldName)) {
      this.SOURCE_ID = (String) __fieldVal;
      return true;
    }
    else    if ("BRANCHID".equals(__fieldName)) {
      this.BRANCHID = (String) __fieldVal;
      return true;
    }
    else    if ("TELLERID".equals(__fieldName)) {
      this.TELLERID = (String) __fieldVal;
      return true;
    }
    else    if ("DEVICETYPE".equals(__fieldName)) {
      this.DEVICETYPE = (String) __fieldVal;
      return true;
    }
    else    if ("CHNLTYPE".equals(__fieldName)) {
      this.CHNLTYPE = (String) __fieldVal;
      return true;
    }
    else    if ("TELLERID2".equals(__fieldName)) {
      this.TELLERID2 = (String) __fieldVal;
      return true;
    }
    else    if ("TSPTRANCODE".equals(__fieldName)) {
      this.TSPTRANCODE = (String) __fieldVal;
      return true;
    }
    else    if ("TRANPROCCODE".equals(__fieldName)) {
      this.TRANPROCCODE = (String) __fieldVal;
      return true;
    }
    else    if ("TRANAMT".equals(__fieldName)) {
      this.TRANAMT = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("TRANFEE".equals(__fieldName)) {
      this.TRANFEE = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("CURRENCYTYPE".equals(__fieldName)) {
      this.CURRENCYTYPE = (String) __fieldVal;
      return true;
    }
    else    if ("DEVCYCLENUM".equals(__fieldName)) {
      this.DEVCYCLENUM = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("CARDNO".equals(__fieldName)) {
      this.CARDNO = (String) __fieldVal;
      return true;
    }
    else    if ("ACCOUNTNO".equals(__fieldName)) {
      this.ACCOUNTNO = (String) __fieldVal;
      return true;
    }
    else    if ("CIF_ID".equals(__fieldName)) {
      this.CIF_ID = (String) __fieldVal;
      return true;
    }
    else    if ("CIF_NAME".equals(__fieldName)) {
      this.CIF_NAME = (String) __fieldVal;
      return true;
    }
    else    if ("CARDNO2".equals(__fieldName)) {
      this.CARDNO2 = (String) __fieldVal;
      return true;
    }
    else    if ("ACCOUNTNO2".equals(__fieldName)) {
      this.ACCOUNTNO2 = (String) __fieldVal;
      return true;
    }
    else    if ("CIF_ID2".equals(__fieldName)) {
      this.CIF_ID2 = (String) __fieldVal;
      return true;
    }
    else    if ("CIF_NAME2".equals(__fieldName)) {
      this.CIF_NAME2 = (String) __fieldVal;
      return true;
    }
    else    if ("TSPDATE".equals(__fieldName)) {
      this.TSPDATE = (String) __fieldVal;
      return true;
    }
    else    if ("TSPTIME".equals(__fieldName)) {
      this.TSPTIME = (String) __fieldVal;
      return true;
    }
    else    if ("HOSTDATE".equals(__fieldName)) {
      this.HOSTDATE = (String) __fieldVal;
      return true;
    }
    else    if ("HOSTTIME".equals(__fieldName)) {
      this.HOSTTIME = (String) __fieldVal;
      return true;
    }
    else    if ("CLIENTDATE".equals(__fieldName)) {
      this.CLIENTDATE = (String) __fieldVal;
      return true;
    }
    else    if ("CLIENTTIME".equals(__fieldName)) {
      this.CLIENTTIME = (String) __fieldVal;
      return true;
    }
    else    if ("DELDATE".equals(__fieldName)) {
      this.DELDATE = (String) __fieldVal;
      return true;
    }
    else    if ("DELTIME".equals(__fieldName)) {
      this.DELTIME = (String) __fieldVal;
      return true;
    }
    else    if ("CYCDATE".equals(__fieldName)) {
      this.CYCDATE = (String) __fieldVal;
      return true;
    }
    else    if ("TSPDATE2".equals(__fieldName)) {
      this.TSPDATE2 = (String) __fieldVal;
      return true;
    }
    else    if ("TSPTIME2".equals(__fieldName)) {
      this.TSPTIME2 = (String) __fieldVal;
      return true;
    }
    else    if ("CYCDATE2".equals(__fieldName)) {
      this.CYCDATE2 = (String) __fieldVal;
      return true;
    }
    else    if ("TSPDATE3".equals(__fieldName)) {
      this.TSPDATE3 = (String) __fieldVal;
      return true;
    }
    else    if ("TSPTIME3".equals(__fieldName)) {
      this.TSPTIME3 = (String) __fieldVal;
      return true;
    }
    else    if ("TSPTRACENUM".equals(__fieldName)) {
      this.TSPTRACENUM = (String) __fieldVal;
      return true;
    }
    else    if ("HOSTTRACENUM".equals(__fieldName)) {
      this.HOSTTRACENUM = (String) __fieldVal;
      return true;
    }
    else    if ("CLIENTTRACENUM".equals(__fieldName)) {
      this.CLIENTTRACENUM = (String) __fieldVal;
      return true;
    }
    else    if ("TSPTRACENUM2".equals(__fieldName)) {
      this.TSPTRACENUM2 = (String) __fieldVal;
      return true;
    }
    else    if ("HOSTTRACENUM2".equals(__fieldName)) {
      this.HOSTTRACENUM2 = (String) __fieldVal;
      return true;
    }
    else    if ("TSPTRACENUM3".equals(__fieldName)) {
      this.TSPTRACENUM3 = (String) __fieldVal;
      return true;
    }
    else    if ("HOSTTRACENUM3".equals(__fieldName)) {
      this.HOSTTRACENUM3 = (String) __fieldVal;
      return true;
    }
    else    if ("CLIENTTRACENUM3".equals(__fieldName)) {
      this.CLIENTTRACENUM3 = (String) __fieldVal;
      return true;
    }
    else    if ("TSPRETCODE".equals(__fieldName)) {
      this.TSPRETCODE = (String) __fieldVal;
      return true;
    }
    else    if ("HOSTRETCODE".equals(__fieldName)) {
      this.HOSTRETCODE = (String) __fieldVal;
      return true;
    }
    else    if ("DEVRETCODE".equals(__fieldName)) {
      this.DEVRETCODE = (String) __fieldVal;
      return true;
    }
    else    if ("TRANSTAT".equals(__fieldName)) {
      this.TRANSTAT = (String) __fieldVal;
      return true;
    }
    else    if ("ODSSTAT".equals(__fieldName)) {
      this.ODSSTAT = (String) __fieldVal;
      return true;
    }
    else    if ("MEMO1".equals(__fieldName)) {
      this.MEMO1 = (String) __fieldVal;
      return true;
    }
    else    if ("MEMO2".equals(__fieldName)) {
      this.MEMO2 = (String) __fieldVal;
      return true;
    }
    else    if ("MEMO3".equals(__fieldName)) {
      this.MEMO3 = (String) __fieldVal;
      return true;
    }
    else    if ("DELCYCDATE".equals(__fieldName)) {
      this.DELCYCDATE = (String) __fieldVal;
      return true;
    }
    else    if ("CLIENTDATE2".equals(__fieldName)) {
      this.CLIENTDATE2 = (String) __fieldVal;
      return true;
    }
    else    if ("CLIENTTIME2".equals(__fieldName)) {
      this.CLIENTTIME2 = (String) __fieldVal;
      return true;
    }
    else    if ("CLIENTTRACENUM2".equals(__fieldName)) {
      this.CLIENTTRACENUM2 = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
