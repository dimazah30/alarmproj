package transmissionParameters;


/**
* transmissionParameters/LayerRateList_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� transmissionParameters.idl
* 2009��9��2�� ������ ����03ʱ27��33�� CST
*/


/**
   * <p>Set of LayerRate_T.<p>
   **/
public final class LayerRateList_THolder implements org.omg.CORBA.portable.Streamable
{
  public short value[] = null;

  public LayerRateList_THolder ()
  {
  }

  public LayerRateList_THolder (short[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = transmissionParameters.LayerRateList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    transmissionParameters.LayerRateList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return transmissionParameters.LayerRateList_THelper.type ();
  }

}
