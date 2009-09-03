package CosNaming;


/**
* CosNaming/BindingIteratorOperations.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNaming.idl
* 2009��9��2�� ������ ����02ʱ45��19�� CST
*/


/**
 * The BindingIterator interface allows a client to iterate through the
 * bindings using the next_one or next_n operations.
 */
public interface BindingIteratorOperations 
{

  /**
 * This operation returns the next binding. If there are no more
 * bindings, false is returned.
 *
 * @parm b - next binding.
 */
  boolean next_one (CosNaming.BindingHolder b);

  /** 
 * This operation returns at most the requested number of bindings.
 *
 * @parm how_many - maximum number of binding to return in bl.
 * @parm bl - list of bindings.
 */
  boolean next_n (int how_many, CosNaming.BindingListHolder bl);

  /** 
 * This operation destroys the iterator.
 */
  void destroy ();
} // interface BindingIteratorOperations
