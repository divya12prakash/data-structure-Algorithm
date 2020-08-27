package com.dp.datastructures;

import com.dp.coredatastructures.BinarySearchTree;
import com.dp.coredatastructures.FenwickTree;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Iterator;

@SpringBootTest
class DataStructuresApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void test_FedwickTree(){
		long[] values = {0,3,4,-2,7,3,11,5,-8,-9,2,4,-8};
		FenwickTree fedwickTree = new FenwickTree(values);
		System.out.println(fedwickTree.toString());
		
	}

	@Test
	void test_BinaryTree(){
		BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
		binarySearchTree.add(3);
		binarySearchTree.add(6);
		binarySearchTree.add(2);
		binarySearchTree.add(9);
		binarySearchTree.add(7);
		binarySearchTree.add(12);
		binarySearchTree.add(5);
		binarySearchTree.add(1);
		
		//binarySearchTree.remove(9);
		Iterator<Integer> iter = binarySearchTree.traverse("IN_ORDER");
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		System.out.println(binarySearchTree);
	}
}
