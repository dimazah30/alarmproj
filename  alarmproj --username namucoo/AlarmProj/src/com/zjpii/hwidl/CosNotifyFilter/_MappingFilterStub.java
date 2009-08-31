package CosNotifyFilter;


/**
* CosNotifyFilter/_MappingFilterStub.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyFilter.idl
* 2009年8月26日 星期三 上午11时27分17秒 CST
*/


// Filter
public class _MappingFilterStub extends org.omg.CORBA.portable.ObjectImpl implements CosNotifyFilter.MappingFilter
{

  public String constraint_grammar ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_get_constraint_grammar", true);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return constraint_grammar (        );
            } finally {
                _releaseReply ($in);
            }
  } // constraint_grammar

  public org.omg.CORBA.Any default_value ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_get_default_value", true);
                $in = _invoke ($out);
                org.omg.CORBA.Any $result = $in.read_any ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return default_value (        );
            } finally {
                _releaseReply ($in);
            }
  } // default_value

  public CosNotifyFilter.MappingConstraintInfo[] add_mapping_constraints (CosNotifyFilter.MappingConstraintPair[] pair_list) throws CosNotifyFilter.InvalidConstraint, CosNotifyFilter.InvalidValue
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("add_mapping_constraints", true);
                CosNotifyFilter.MappingConstraintPairSeqHelper.write ($out, pair_list);
                $in = _invoke ($out);
                CosNotifyFilter.MappingConstraintInfo $result[] = CosNotifyFilter.MappingConstraintInfoSeqHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotifyFilter/InvalidConstraint:1.0"))
                    throw CosNotifyFilter.InvalidConstraintHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNotifyFilter/InvalidValue:1.0"))
                    throw CosNotifyFilter.InvalidValueHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return add_mapping_constraints (pair_list        );
            } finally {
                _releaseReply ($in);
            }
  } // add_mapping_constraints

  public void modify_mapping_constraints (int[] del_list, CosNotifyFilter.MappingConstraintInfo[] modify_list) throws CosNotifyFilter.InvalidConstraint, CosNotifyFilter.InvalidValue, CosNotifyFilter.ConstraintNotFound
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("modify_mapping_constraints", true);
                CosNotifyFilter.ConstraintIDSeqHelper.write ($out, del_list);
                CosNotifyFilter.MappingConstraintInfoSeqHelper.write ($out, modify_list);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotifyFilter/InvalidConstraint:1.0"))
                    throw CosNotifyFilter.InvalidConstraintHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNotifyFilter/InvalidValue:1.0"))
                    throw CosNotifyFilter.InvalidValueHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNotifyFilter/ConstraintNotFound:1.0"))
                    throw CosNotifyFilter.ConstraintNotFoundHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                modify_mapping_constraints (del_list, modify_list        );
            } finally {
                _releaseReply ($in);
            }
  } // modify_mapping_constraints

  public CosNotifyFilter.MappingConstraintInfo[] get_mapping_constraints (int[] id_list) throws CosNotifyFilter.ConstraintNotFound
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_mapping_constraints", true);
                CosNotifyFilter.ConstraintIDSeqHelper.write ($out, id_list);
                $in = _invoke ($out);
                CosNotifyFilter.MappingConstraintInfo $result[] = CosNotifyFilter.MappingConstraintInfoSeqHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotifyFilter/ConstraintNotFound:1.0"))
                    throw CosNotifyFilter.ConstraintNotFoundHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_mapping_constraints (id_list        );
            } finally {
                _releaseReply ($in);
            }
  } // get_mapping_constraints

  public CosNotifyFilter.MappingConstraintInfo[] get_all_mapping_constraints ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_all_mapping_constraints", true);
                $in = _invoke ($out);
                CosNotifyFilter.MappingConstraintInfo $result[] = CosNotifyFilter.MappingConstraintInfoSeqHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_all_mapping_constraints (        );
            } finally {
                _releaseReply ($in);
            }
  } // get_all_mapping_constraints

  public void remove_all_mapping_constraints ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("remove_all_mapping_constraints", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                remove_all_mapping_constraints (        );
            } finally {
                _releaseReply ($in);
            }
  } // remove_all_mapping_constraints

  public void destroy ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("destroy", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                destroy (        );
            } finally {
                _releaseReply ($in);
            }
  } // destroy

  public boolean match (org.omg.CORBA.Any filterable_data, org.omg.CORBA.AnyHolder result_to_set) throws CosNotifyFilter.UnsupportedFilterableData
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("match", true);
                $out.write_any (filterable_data);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                result_to_set.value = $in.read_any ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotifyFilter/UnsupportedFilterableData:1.0"))
                    throw CosNotifyFilter.UnsupportedFilterableDataHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return match (filterable_data, result_to_set        );
            } finally {
                _releaseReply ($in);
            }
  } // match

  public boolean match_structured (CosNotification.StructuredEvent filterable_data, org.omg.CORBA.AnyHolder result_to_set) throws CosNotifyFilter.UnsupportedFilterableData
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("match_structured", true);
                CosNotification.StructuredEventHelper.write ($out, filterable_data);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                result_to_set.value = $in.read_any ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotifyFilter/UnsupportedFilterableData:1.0"))
                    throw CosNotifyFilter.UnsupportedFilterableDataHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return match_structured (filterable_data, result_to_set        );
            } finally {
                _releaseReply ($in);
            }
  } // match_structured

  public boolean match_typed (CosNotification.Property[] filterable_data, org.omg.CORBA.AnyHolder result_to_set) throws CosNotifyFilter.UnsupportedFilterableData
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("match_typed", true);
                CosNotification.PropertySeqHelper.write ($out, filterable_data);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                result_to_set.value = $in.read_any ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotifyFilter/UnsupportedFilterableData:1.0"))
                    throw CosNotifyFilter.UnsupportedFilterableDataHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return match_typed (filterable_data, result_to_set        );
            } finally {
                _releaseReply ($in);
            }
  } // match_typed

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/CosNotifyFilter/MappingFilter:1.0"};

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
} // class _MappingFilterStub
