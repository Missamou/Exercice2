import java.util.Scanner;  
  
public class Solver {  
      
    private static int[][] Grille = new int[9][9];  
      
    public static void main(String[] args) {  
      
    Scanner TCellule = new Scanner(System.in);  
      
    for(int y = 0; y < 9; y++) {  
        System.out.print("Entrer les valeurs : ");  
        for(int x = 0; x < 9; x++) {  
        Grille[x][y] = TCellule.nextInt();  
        }  
        TCellule.nextLine();  
    }  
      
    System.out.println("Etat initial: ");  
    printBoard();  
  
    solve(0, 0);  
  
    System.out.println("Etat Final : ");  
    printBoard();  
    }  
  
    public static void solve(int x, int y) {  
    // Recherche prochaine cellule libre
    int[] nextCellLibre = RechercheCellLibre(x, y);  
    if(nextCellLibre == null) return;  
    int PosX = nextCellLibre[0];  
    int PosY = nextCellLibre[1];  
      
    System.out.println("PosX: " + PosX + " PosY: " + PosY); // Verification
  
    // Essai de remplissage
    for(int ChiffreCourant = RemplirCell(1, PosX, PosY); ChiffreCourant != -1;   
        ChiffreCourant = RemplirCell(ChiffreCourant+1, PosX, PosY)) {  
  
        if(PosX >= 8)  
        solve(0, PosY+1);  
        else  
        solve(PosX+1, PosY);  
        if(final()) return;  
    }  
    }  
  
    public static int RemplirCell(int val, int x, int y) {  
        if(val > 9) return -1;  
    if(verifLigne(val, x) && verifColonne(val, y) && verifTableau(val, x, y)) {  
        Grille[x][y] = val;  
        return val;  
    }  
    return RemplirCell(val+1, x, y);  
    }  
  
    public static boolean verifLigne(int val, int x) {  
    for(int i = 0; i < 9; i++) {  
        if(Grille[x][i] == val) return false;  
    }  
    return true;  
    }  
  
    public static boolean verifColonne(int val, int y) {  
    for(int i = 0; i < 9; i++) {  
        if(Grille[i][y] == val) return false;  
    }  
    return true;  
    }  
  
    public static boolean verifTableau(int val, int x, int y) {  
  
    // find 3x3's upper right x/ys  
    int i = (x / 3) * 3;  
    int j = (y / 3) * 3;  
  
    // check each cell in the 3x3  
    for(int ligne = i; ligne < i+3; ligne++) {  
        for(int colonne = j; colonne < j+3; colonne++) {  
        if(Grille[ligne][colonne] == val) return false;  
        }  
    }  
    return true;  
    }  
  
    public static void printBoard() {  
    for(int y = 0; y < 9; y++) {  
        if(y%3 == 0) System.out.println("");  
        for(int x = 0; x < 9; x++) {  
        if(x%3 == 0) System.out.print("  ");  
        if(Grille[x][y] == 0)  
            System.out.print("_ ");  
        else  
            System.out.print(Grille[x][y] + " ");  
        }  
        System.out.println("");  
    }  
    }  
  
    public static int[] RechercheCellLibre(int x, int y) {  
    for(int colonne = y; colonne < 9; colonne++) {  
        for(int ligne = x; ligne < 9; ligne++) {  
        if(Grille[ligne][colonne] == 0) {  
            return new int[] {ligne, colonne};  
        }  
        }  
    }  
    return null;  
    }   
  
    public static boolean final() {  
    for(int ligne = 0; ligne < 9; ligne++) {  
        for(int colonne = 0; colonne < 9; colonne++) {  
        if(Grille[ligne][colonne] == 0)  
            return false;  
        }  
    }  
    return true;  
    }  
}