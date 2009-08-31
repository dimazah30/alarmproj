package CosNotifyFilter;


/**
* CosNotifyFilter/_FilterFactoryStub.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyFilter.idl
* 2009年8月26日 星期三 上午11时27分17秒 CST
*/


// MappingFilter
public class _FilterFactoryStub extends org.omg.CORBA.portable.ObjectImpl implements CosNotifyFilter.FilterFactory
{

  public CosNotifyFilter.Filter create_filter (String constraint_grammar) throws CosNotifyFilter.InvalidGrammar
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("create_filter", true);
                $out.write_string (constraint_grammar);
                $in = _invoke ($out);
                CosNotifyFilter.Filter $result = CosNotifyFilter.FilterHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotifyFilter/InvalidGrammar:1.0"))
                    throw CosNotifyFilter.InvalidGrammarHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return create_filter (constraint_grammar        );
            } finally {
                _releaseReply ($in);
            }
  } // create_filter

  public CosNotifyFilter.MappingFilter create_mapping_filter (String constraint_grammar, org.omg.CORBA.Any default_value) throws CosNotifyFilter.InvalidGrammar
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("create_mapping_filter", true);
                $out.write_string (constraint_grammar);
                $out.write_any (default_value);
                $in = _invoke ($out);
                CosNotifyFilter.MappingFilter $result = CosNotifyFilter.MappingFilterHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotifyFilter/InvalidGrammar:1.0"))
                    throw CosNotifyFilter.InvalidGrammarHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return create_mapping_filter (constraint_grammar, default_value        );
            } finally {
                _releaseReply ($in);
            }
  } // create_mapping_filter

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/CosNotifyFilter/FilterFactory:1.0"};

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
} // class _FilterFactoryStub
