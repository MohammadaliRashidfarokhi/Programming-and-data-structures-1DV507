package mr223_assign4.count_words;

import java.util.Iterator;

public class HashWordSet implements  WordSet{
    private Node[] bucket = new Node[18];

    public int size;

    @Override
    public void add(Word word) {
        int spot = bucketNumGetter(word);
        Node node = bucket[spot];
        while(node!=null){
            if(node.data.toString().equals(word.toString())){
                return;
            }
            else{
                node=node.next;
            }
        }
        node= new Node(word);
        node.next = bucket[spot];
        bucket[spot]= node;
        size++;

        if(size== bucket.length){
            rehash();
        }
    }

    @Override
    public boolean contains(Word word) {
        int pos = bucketNumGetter(word);
        Node nodes = bucket[pos];
        while (nodes != null){
            if (nodes.data.toString().equals(word.toString()))
                return true;
            else
                nodes = nodes.next;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    void rehash(){
        Node[] nodes = bucket;
        bucket = new Node[2* nodes.length];
        size=0;

        for(Node n:nodes){
            if(n==null){
                continue;
            }
            while(n!=null){
                add(n.data);
                n=n.next;
            }
        }
    }

    int bucketNumGetter(Word word){
        int h = word.hashCode();
        if(h<0){
            h=-h;
        }
        return h % bucket.length;
    }
    @Override
    public String toString(){
        StringBuilder stringBuilder =new StringBuilder();
        stringBuilder.append("[");

        for (int i = 0; i< bucket.length; i++){
            if (bucket[i]!=null){
                stringBuilder.append(bucket[i].data.toString()+" ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public Iterator<Word> iterator() {
        return null;
    }

    private class Node{
        private Node next=null;
        private  Word data;

        public Node(Word w){
            data = w;
        }

        public Word getWord(){
            return data;
        }
        public String toString(){
            return data.toString();
        }
    }

}
