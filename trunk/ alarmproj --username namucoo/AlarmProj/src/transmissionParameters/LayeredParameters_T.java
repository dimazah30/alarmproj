package transmissionParameters;


/**
* transmissionParameters/LayeredParameters_T.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� transmissionParameters.idl
* 2009��9��2�� ������ ����03ʱ27��34�� CST
*/

public final class LayeredParameters_T implements org.omg.CORBA.portable.IDLEntity
{
  public short layer = (short)0;
  public globaldefs.NameAndStringValue_T transmissionParams[] = null;

  public LayeredParameters_T ()
  {
  } // ctor

  public LayeredParameters_T (short _layer, globaldefs.NameAndStringValue_T[] _transmissionParams)
  {
    layer = _layer;
    transmissionParams = _transmissionParams;
  } // ctor

} // class LayeredParameters_T
