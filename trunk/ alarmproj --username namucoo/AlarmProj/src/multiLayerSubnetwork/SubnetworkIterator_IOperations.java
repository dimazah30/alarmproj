package multiLayerSubnetwork;


/**
* multiLayerSubnetwork/SubnetworkIterator_IOperations.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� multiLayerSubnetwork.idl
* 2009��9��2�� ������ ����03ʱ26��24�� CST
*/


/**
   * <p>In order to allow the NMS to deal with a large number of objects,
   * iterators are used.</p>
   * <p>See <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
   * for information on how iterators are used in this interface.</p>
   **/
public interface SubnetworkIterator_IOperations 
{
  boolean next_n (int how_many, multiLayerSubnetwork.SubnetworkList_THolder subnetworkList) throws globaldefs.ProcessingFailureException;
  int getLength () throws globaldefs.ProcessingFailureException;
  void destroy () throws globaldefs.ProcessingFailureException;
} // interface SubnetworkIterator_IOperations
