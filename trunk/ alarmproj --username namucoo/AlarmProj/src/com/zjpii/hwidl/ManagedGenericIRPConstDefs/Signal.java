package ManagedGenericIRPConstDefs;


/**
* ManagedGenericIRPConstDefs/Signal.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� ManagedGenericIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��45�� CST
*/

public class Signal implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 3;
  private static ManagedGenericIRPConstDefs.Signal[] __array = new ManagedGenericIRPConstDefs.Signal [__size];

  public static final int _OK = 0;
  public static final ManagedGenericIRPConstDefs.Signal OK = new ManagedGenericIRPConstDefs.Signal(_OK);
  public static final int _Failure = 1;
  public static final ManagedGenericIRPConstDefs.Signal Failure = new ManagedGenericIRPConstDefs.Signal(_Failure);
  public static final int _PartialFailure = 2;
  public static final ManagedGenericIRPConstDefs.Signal PartialFailure = new ManagedGenericIRPConstDefs.Signal(_PartialFailure);

  public int value ()
  {
    return __value;
  }

  public static ManagedGenericIRPConstDefs.Signal from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected Signal (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class Signal
