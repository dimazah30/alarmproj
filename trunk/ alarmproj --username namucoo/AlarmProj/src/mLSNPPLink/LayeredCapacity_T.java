package mLSNPPLink;


/**
* mLSNPPLink/LayeredCapacity_T.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� mLSNPPLink.idl
* 2009��9��2�� ������ ����03ʱ26��02�� CST
*/

public final class LayeredCapacity_T implements org.omg.CORBA.portable.IDLEntity
{
  public short layerRate = (short)0;
  public String capacity = null;

  public LayeredCapacity_T ()
  {
  } // ctor

  public LayeredCapacity_T (short _layerRate, String _capacity)
  {
    layerRate = _layerRate;
    capacity = _capacity;
  } // ctor

} // class LayeredCapacity_T
