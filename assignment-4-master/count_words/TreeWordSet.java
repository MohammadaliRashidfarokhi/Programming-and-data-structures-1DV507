package mr223_assign4.count_words;


import java.util.Iterator;

public class TreeWordSet implements WordSet{
    public Node node;
    StringBuilder stringBuilder =new StringBuilder();
    public int size;

    public TreeWordSet() {

    }
    public class Node{
        public Node left = null;
        public Node right = null;
        public Word data;

        public Node (Word word){
            data = word;
        }
        public void insert(Word w){
            if(w.compareTo(this.data)<0){
                if (this.left == null) {
                    size++;
                    this.left = new Node(w);
                }
                else
                    this.left.insert(w);
            }
            else if(w.compareTo(this.data)>0){
                if(this.right == null){
                    size++;
                    this.right = new Node(w);
                }
                else
                    this.right.insert(w);
            }
        }

        public boolean find(Word w1) {
            if(data.equals(w1))
                return true;
            if(left!=null)
                return left.find(w1);
            if(right!=null)
                return right.find(w1);
            return false;
        }
       public void toStringHelper(){
            if(left != null)
                left.toStringHelper();
            stringBuilder.append(" ").append(data.toString());
            if(right != null)
                right.toStringHelper();
        }
    }

    @Override
    public void add(Word word) {
        Node node = new Node(word);
        if(this.node == null){
            size++;
            this.node =node;
        }
        else{
            this.node.insert(word);
        }
    }

    @Override
    public boolean contains(Word word) {
        if (node == null){
            return false;
        }
        else {
            return node.find(word);
        }
    }

    @Override
    public int size() {
        return size;
    }

@Override
    public String toString() {

        stringBuilder.append("[");
        node.toStringHelper();
        stringBuilder.append("]");

        return stringBuilder.toString();
    }

    public Iterator<Word> iterator() {
        return null;
    }
}