package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/ThresholdLevelIndTypeOpt.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
*/

public final class ThresholdLevelIndTypeOpt implements org.omg.CORBA.portable.IDLEntity
{
  private AlarmIRPConstDefs.ThresholdLevelIndType ___value;
  private boolean __discriminator;
  private boolean __uninitialized = true;

  public ThresholdLevelIndTypeOpt ()
  {
  }

  public boolean discriminator ()
  {
    if (__uninitialized)
      throw new org.omg.CORBA.BAD_OPERATION ();
    return __discriminator;
  }

  public AlarmIRPConstDefs.ThresholdLevelIndType value ()
  {
    if (__uninitialized)
      throw new org.omg.CORBA.BAD_OPERATION ();
    verifyvalue (__discriminator);
    return ___value;
  }

  public void value (AlarmIRPConstDefs.ThresholdLevelIndType value)
  {
    __discriminator = true;
    ___value = value;
    __uninitialized = false;
  }

  public void value (boolean discriminator, AlarmIRPConstDefs.ThresholdLevelIndType value)
  {
    verifyvalue (discriminator);
    __discriminator = discriminator;
    ___value = value;
    __uninitialized = false;
  }

  private void verifyvalue (boolean discriminator)
  {
    if (discriminator != true)
      throw new org.omg.CORBA.BAD_OPERATION ();
  }

  public void _default ()
  {
    __discriminator = false;
    __uninitialized = false;
  }

  public void _default (boolean discriminator)
  {
    verifyDefault( discriminator ) ;
    __discriminator = discriminator ;
    __uninitialized = false;
  }

  private void verifyDefault( boolean value )
  {
	  if(value){
		  throw new org.omg.CORBA.BAD_OPERATION() ;
	  }else{
		  return ;
	  }
//    switch (value) {
//      case true:
//        throw new org.omg.CORBA.BAD_OPERATION() ;
//
//      default:
//        return;
//    }
  }

} // class ThresholdLevelIndTypeOpt
