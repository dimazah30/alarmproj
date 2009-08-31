package ManagedGenericIRPSystem;


/**
* ManagedGenericIRPSystem/OperationNotSupported.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� ManagedGenericIRPSystem.idl
* 2009��8��24�� ����һ ����09ʱ34��17�� CST
*/


/*
   Exception thrown when an unsupported optional method is called.
   */
public final class OperationNotSupported extends org.omg.CORBA.UserException
{

  public OperationNotSupported ()
  {
    super(OperationNotSupportedHelper.id());
  } // ctor


  public OperationNotSupported (String $reason)
  {
    super(OperationNotSupportedHelper.id() + "  " + $reason);
  } // ctor

} // class OperationNotSupported
