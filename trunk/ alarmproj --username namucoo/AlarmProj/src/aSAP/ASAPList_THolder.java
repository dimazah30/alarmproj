package aSAP;


/**
* aSAP/ASAPList_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� aSAP.idl
* 2009��9��2�� ������ ����03ʱ25��09�� CST
*/


/**
   * <p>Sequence of ASAP_T.</p>
   **/
public final class ASAPList_THolder implements org.omg.CORBA.portable.Streamable
{
  public aSAP.ASAP_T value[] = null;

  public ASAPList_THolder ()
  {
  }

  public ASAPList_THolder (aSAP.ASAP_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = aSAP.ASAPList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    aSAP.ASAPList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return aSAP.ASAPList_THelper.type ();
  }

}