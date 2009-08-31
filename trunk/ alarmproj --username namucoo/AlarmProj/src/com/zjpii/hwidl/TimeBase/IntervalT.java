package TimeBase;


/**
* TimeBase/IntervalT.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� TimeBase.idl
* 2009��8��24�� ����һ ����09ʱ36��53�� CST
*/

public final class IntervalT implements org.omg.CORBA.portable.IDLEntity
{
  public long lower_bound = (long)0;
  public long upper_bound = (long)0;

  public IntervalT ()
  {
  } // ctor

  public IntervalT (long _lower_bound, long _upper_bound)
  {
    lower_bound = _lower_bound;
    upper_bound = _upper_bound;
  } // ctor

} // class IntervalT
