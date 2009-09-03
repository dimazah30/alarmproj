package managedElement;


/**
* managedElement/ManagedElementIterator_IOperations.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� managedElement.idl
* 2009��9��2�� ������ ����03ʱ27��41�� CST
*/


/**
   * <p>In order to allow the NMS to deal with a large number of objects,
   * iterators are used.</p>
   * <p>See <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
   * for information on how iterators are used in this interface.</p>
   **/
public interface ManagedElementIterator_IOperations 
{
  boolean next_n (int how_many, managedElement.ManagedElementList_THolder meList) throws globaldefs.ProcessingFailureException;
  int getLength () throws globaldefs.ProcessingFailureException;
  void destroy () throws globaldefs.ProcessingFailureException;
} // interface ManagedElementIterator_IOperations
