package mLSNPPLink;


/**
* mLSNPPLink/AvailableCapacity_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 mLSNPPLink.idl
* 2009年9月2日 星期三 下午03时26分02秒 CST
*/


/**
   * <p>This represents the available capacity of a Multi-Layer SNPP Link, in
   * terms of the capacity for each of the layer rates supported (i.e., the
   * layer rate of the constituent SNPP links).
   **/
public final class AvailableCapacity_THolder implements org.omg.CORBA.portable.Streamable
{
  public mLSNPPLink.LayeredCapacity_T value[] = null;

  public AvailableCapacity_THolder ()
  {
  }

  public AvailableCapacity_THolder (mLSNPPLink.LayeredCapacity_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = mLSNPPLink.AvailableCapacity_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    mLSNPPLink.AvailableCapacity_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return mLSNPPLink.AvailableCapacity_THelper.type ();
  }

}
