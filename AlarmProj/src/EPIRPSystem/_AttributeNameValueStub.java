package EPIRPSystem;


/**
* EPIRPSystem/_AttributeNameValueStub.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� EPIRPSystem.idl
* 2009��8��25�� ���ڶ� ����04ʱ07��42�� CST
*/


/*
  Define the parameters specified in
  the notifyEpInfoChanges notification.
  */
public class _AttributeNameValueStub extends org.omg.CORBA.portable.ObjectImpl implements EPIRPSystem.AttributeNameValue
{

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:3gppsa5.org/EPIRPSystem/AttributeNameValue:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.Object obj = org.omg.CORBA.ORB.init (args, props).string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     String str = org.omg.CORBA.ORB.init (args, props).object_to_string (this);
     s.writeUTF (str);
  }
} // class _AttributeNameValueStub
