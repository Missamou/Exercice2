package test;

import static org.junit.Assert.*;
import main.SortTab;

import org.junit.Test;

public class SortTabTest {

/* Tests unitaires algorithmes de tri a bulles*/
	@Test
	public void testBubbleSort1() {
	      int[] t={0} ;
	      SortTab.selectSort(t);
	      for (int i=0 ; i<t.length ; i++) {
	         int actuel  = t[i];
	         int attendu = i;
	         assertEquals("Le tableau ne contient qu'un élément unique", attendu, actuel);
	      }
	  }
	@Test
	public void testBubbleSort2() {
		int[] t={0,1,2,3,4,5,6,7,8,9,10};
	    SortTab.bubbleSort(t);
	    for (int i=0 ; i<t.length ; i++) {
	         int actuel  = t[i];
	         int attendu = i;
	         assertEquals("Le tableau est déjà trié", attendu, actuel);
	      }
	  }
	@Test
	public void testBubbleSort3() {
		int[] t={0,1,2,3,4,5,6,7,8,9,10};
		 SortTab.bubbleSort(t);
	    for (int i=0 ; i<t.length ; i++) {
	         int actuel  = t[i];
	         int attendu = i;
	         assertEquals("Le tableau est déjà trié", attendu, actuel);
	      }
	  }
	@Test
	 public void testBubbleSort4() {
		  int[] t={10,9,8,7,6,5,4,3,2,1,0} ;
		  SortTab.bubbleSort(t);
	      for (int i=0 ; i<t.length ; i++) {
	         int actuel  = t[i];
	         int attendu = i;
	         assertEquals("le tableau est trié en ordre inversé", attendu, actuel);
	      }
	  }
	
	/* Tests unitaires algorithmes de tri par selection*/
	@Test
	public void testselectSort1() {
	      int[] t={0} ;
	      SortTab.selectSort(t);
	      for (int i=0 ; i<t.length ; i++) {
	         int actuel  = t[i];
	         int attendu = i;
	         assertEquals("Le tableau ne contient qu'un élément unique", attendu, actuel);
	      }
	  }
	@Test
	public void testselectSort2() {
		int[] t={0,1,2,3,4,5,6,7,8,9,10};
	    SortTab.selectSort(t);
	    for (int i=0 ; i<t.length ; i++) {
	         int actuel  = t[i];
	         int attendu = i;
	         assertEquals("Le tableau est déjà trié", attendu, actuel);
	      }
	  }
	@Test
	public void testselectSort3() {
		int[] t={0,1,2,3,4,5,6,7,8,9,10};
		 SortTab.selectSort(t);
	    for (int i=0 ; i<t.length ; i++) {
	         int actuel  = t[i];
	         int attendu = i;
	         assertEquals("Le tableau est déjà trié", attendu, actuel);
	      }
	  }
	@Test
	 public void testselectSort4() {
		  int[] t={10,9,8,7,6,5,4,3,2,1,0} ;
		  SortTab.selectSort(t);
	      for (int i=0 ; i<t.length ; i++) {
	         int actuel  = t[i];
	         int attendu = i;
	         assertEquals("le tableau est trié en ordre inversé", attendu, actuel);
	      }
	  }
	
	/* Tests unitaires algorithmes de tri rapide*/
	@Test
	public void testQuickSort1() {
	      int[] t={0} ;
	      SortTab.quickSort(t, 0, t.length-1);
	      for (int i=0 ; i<t.length ; i++) {
	         int actuel  = t[i];
	         int attendu = i;
	         assertEquals("Le tableau ne contient qu'un élément unique", attendu, actuel);
	      }
	  }
	@Test
	public void testQuickSort2() {
		int[] t={0,1,2,3,4,5,6,7,8,9,10};
	    SortTab.quickSort(t, 0, t.length-1);
	    for (int i=0 ; i<t.length ; i++) {
	         int actuel  = t[i];
	         int attendu = i;
	         assertEquals("Le tableau est déjà trié", attendu, actuel);
	      }
	  }
	@Test
	public void testQuickSort3() {
		int[] t={0,1,2,3,4,5,6,7,8,9,10};
		 SortTab.quickSort(t, 0, t.length-1);
	    for (int i=0 ; i<t.length ; i++) {
	         int actuel  = t[i];
	         int attendu = i;
	         assertEquals("Le tableau est déjà trié", attendu, actuel);
	      }
	  }
	@Test
	 public void testquickSort4() {
		  int[] t={10,9,8,7,6,5,4,3,2,1,0} ;
		  SortTab.quickSort(t, 0, t.length-1);
	      for (int i=0 ; i<t.length ; i++) {
	         int actuel  = t[i];
	         int attendu = i;
	         assertEquals("le tableau est trié en ordre inversé", attendu, actuel);
	      }
	  }
		
	/* Tests unitaires algorithmes de tri fusion*/
	@Test
	public void testmergeSort1() {
	      int[] t={0} ;
	      SortTab.mergeSort(t, 0, t.length);
	      for (int i=0 ; i<t.length ; i++) {
	         int actuel  = t[i];
	         int attendu = i;
	         assertEquals("Le tableau ne contient qu'un élément unique", attendu, actuel);
	      }
	  }
	@Test
	public void testmergeSort2() {
		int[] t={0,1,2,3,4,5,6,7,8,9,10};
	    SortTab.mergeSort(t, 0, t.length);
	    for (int i=0 ; i<t.length ; i++) {
	         int actuel  = t[i];
	         int attendu = i;
	         assertEquals("Le tableau est déjà trié", attendu, actuel);
	      }
	  }
	@Test
	public void testmergeSort3() {
		int[] t={0,1,2,3,4,5,6,7,8,9,10};
		 SortTab.mergeSort(t, 0, t.length);
	    for (int i=0 ; i<t.length ; i++) {
	         int actuel  = t[i];
	         int attendu = i;
	         assertEquals("Le tableau est déjà trié", attendu, actuel);
	      }
	  }
	@Test
	 public void testmergeSort4() {
		  int[] t={10,9,8,7,6,5,4,3,2,1,0} ;
		  SortTab.mergeSort(t, 0, 11);
	      for (int i=0 ; i<11 ; i++) {
	         int actuel  = t[i];
	         int attendu = i;
	         assertEquals("le tableau est trié en ordre inversé", attendu, actuel);
	      }
	  }	
}

