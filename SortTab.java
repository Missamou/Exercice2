package main;

import java.util.*;
/** 
 * Algorithmes de Tri.
 **/

public final class SortTab {
	
	/* Constructeur privé pour empecher l'instanciation de classe.*/
	
	public SortTab() {}
	/**
	 * Generation d'un tableau d'entiers aleatoires.
	 * @ param size taille du tableau
	 * @ return un tableau d'entiers aleatoires
	 **/
	public static int[] randomTab(final int size) {
		Random rand = new Random();
		int[] tab = new int [size];
		for ( int i = 0; i < tab.length; i++ ) {
			tab[i] = rand.nextInt();
		}
		return tab;
	}

/* Tri a bulles. */
	
public static void bubbleSort (final int[] tab) {
	int i, aux;
	int t1=tab.length-1;
	while (t1>0) {
		for (i=0; i<t1 ; i++) {
			if (tab[i] > tab[i+1]) {
			//echanger(tab, i, i+1);			
				aux= tab[i];
				tab[i]=tab[i+1];
				tab[i+1]=aux;
			}
		}
		t1--;
	}
}

/* Tri par selection. */
public static void selectSort (final int[] tab) {
	int taille=tab.length;
	int indMin ; 
	// Trier tab[0..Taille-1]
	for(int k=0 ; k<taille-1 ; k++) {
	    // chercher la place IndMin du plus petit élément du sous tableau t[i..Taille-1]
	    indMin=k ;
	    for(int j=k+1 ; j<taille ; j++) { 
	    	if(tab[j] < tab[indMin]) indMin=j;
	    	}
	  //echanger(tab, indMin,k);
		 int aux= tab[indMin]; 
		 tab[indMin]=tab[k];
		 tab[k]=aux;
	    }
}

/* Tri rapide. */

private static int partition(int[] t, int gauche, int droit){
    int pivot = t[gauche];
    int i = gauche, j = droit;
    while (i<j) {
        while(i<=droit && t[i]<=pivot) i++;
        while(t[j]>pivot) j--;
        if (i<j) {
        	int aux =t[i] ; t[i]=t[j] ; t[j]=aux ; 
        }
    }
    // j est la position finale du pivot 
    t[gauche] = t[j];
    t[j] = pivot;
    return j;
}

public static void quickSort(int[] t, int gauche, int droite){
    if (gauche<droite){
        int pivot=partition(t,gauche,droite);
        quickSort(t,gauche,pivot-1);
        quickSort(t,pivot+1,droite);
    }
}
/* Tri fusion. */

private static void merge (final int[] tab, int debut, int milieu, int fin) {
	int [] old_tab = (int[]) tab.clone();
	 
	int i1 = debut; //indice dans la première moitié de old_tab
	int i2 = milieu+1; // indice dans la deuxième moitié de old_tab
	int i = debut; //indice dans le tableau tab
 
	while (i1<= milieu && i2 <= fin)
	{
		//quelle est la plus petite tête de liste?
		if(old_tab[i1] <= old_tab[i2])
		{
			tab[i] = old_tab[i1];
			i1++;
		}
		else
		{
			tab[i] = old_tab[i2];
			i2++;
		}
		i++;
	}
	if (i<=fin)
	{
		while(i1<=milieu)  // le reste de la première moitié
		{
			tab[i]=old_tab[i1];
			i1++;
			i++;
		}
		while(i2<=fin) // le reste de la deuxième moitié
		{
			tab[i]=old_tab[i2];
			i2++;
			i++;
		}
	}
}

public static void mergeSort (int [] tab, int debut, int fin)
{
	int milieu;
	if(debut<fin)
	{
		milieu = (debut+fin)/2;
		mergeSort(tab, debut, milieu);
		mergeSort(tab, milieu+1, fin);
		merge (tab, debut, milieu, fin);
	}
}
/**
 * Programme principal.
 * @param args Arguments du programme: taille du tableau **/
public static void main (final String[] args) {
	System.out.println ("Generation du tableau ");
	int[] tab = randomTab(Integer.valueOf(args[0]));
   }	 
}
