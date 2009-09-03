package globaldefs;


/**
* globaldefs/Time_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 globaldefs.idl
* 2009年9月2日 星期三 下午02时43分56秒 CST
*/


/**
   * <p>Time_T is represented by a string holding a time string as defined
   * in ITU-T Rec. X.208 "SPECIFICATION OF ABSTRACT SYNTAX NOTATION ONE 
   * (ASN.1)".</p>
   *
   * <p>The format is "yyyyMMddhhmmss.s[Z|{+|-}HHMm]" where:<br>
   *       yyyy        "0000".."9999" year<br>
   *       MM          "01".."12"     month<br>
   *       dd          "01".."31"     day<br>
   *       hh          "00".."23"     hour<br>
   *       mm          "00".."59"     minute<br>
   *       ss          "00".."59"     second<br>
   *       .s          ".0"..".9"     tenth of second (set to ".0" if EMS or ME
   *                                  cannot support this granularity)<br>
   *       Z           "Z"            indicates UTC (rather than local time)<br>
   *       {+|-}       "+" or "-"     delta from UTC
   *       HH          "00".."23"     time zone difference in hours<br>
   *       Mm          "00".."59"     time zone difference in minutes</p>
   *                                                                      
   * <p>"19851106210627.3Z" would be 6 minutes, 27.3 seconds after
   * 9 p.m. on November 6th, 1985 indicating UTC time.  "19851106210627.3" would 
   * be local time.  "19851106210627.3+0500" would be local time specifying a +5 
   * hour time difference from UTC.  "19851106210627.3-0530" would be local time 
   * specifying a -5.5 hour difference from UTC.</p>
   **/
abstract public class Time_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/globaldefs/Time_T:1.0";

  public static void insert (org.omg.CORBA.Any a, String that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static String extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_string_tc (0);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.Time_THelper.id (), "Time_T", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static String read (org.omg.CORBA.portable.InputStream istream)
  {
    String value = null;
    value = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, String value)
  {
    ostream.write_string (value);
  }

}
