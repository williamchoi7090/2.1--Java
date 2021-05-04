class Main{
  static final int val = 10; 
  static class Tree{
    int num; 
    Tree left, right; 
    Tree(int num){
      this.num= num; 
      this.left= null; 
      this.right= null;
    }
  }
  static void Ptree(Tree root, int list){
    if (root== null) 
    return; 
    list+= val; 
    Ptree(root.right, list); 
    System.out.print("\n"); 
    for (int i= val; i< list; i++) 
    System.out.print(" "); 
    System.out.print(root.num+ "\n");  
    Ptree(root.left, list);
  } 
  static void PrintT(Tree root){
    Ptree(root, 0);
  }
  public static void main(String args[]){
    Tree root= new Tree(1); 
    root.left= new Tree(2); 
    root.right= new Tree(2); 
    root.left.left= new Tree(3); 
    root.left.right= new Tree(3); 
    root.right.left= new Tree(3); 
    root.right.right= new Tree(3); 
    root.left.left.left= new Tree(4); 
    root.left.left.right= new Tree(4); 
    root.left.right.left= new Tree(4); 
    root.left.right.right= new Tree(4); 
    root.right.left.left= new Tree(4); 
    root.right.left.right= new Tree(4); 
    root.right.right.left= new Tree(4); 
    root.right.right.right= new Tree(4); 
    PrintT(root);
  } 
}