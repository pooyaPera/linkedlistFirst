public class linkeylist {

    private linky first;

    public linkeylist(){
        first = null;
    }

    public void insertFirst(int data){

        linky newlink = new linky(data);

        newlink.next = first;
        first = newlink;

    }
    public void display(){
        linky current = first;
        while (current != null){
            current.displayLink();
            current = current.next;
        }
    }

    public linky deleteFirst(){

        linky temp = first;
        first = first.next;
        return temp;
    }

    public linky find(int key){
        linky current = first;
        while (current.iData != key){
            if (current.next == null){
                return null;// Didn't find the link with the key
            }else {
                current= current.next;// geh zur der nächster Link
            }
        }
        return current;
    }

    public linky delete(int key){
        linky current = first;
        linky previous = first;

        while (current.iData != key){//search for link
            if (current.next == null){
                return null;
            }else
                previous = current;//go to next link
                current= current.next;
        }//found it
        if (current== first){//if first link, change first link
            first = first.next;
        }else
            previous.next= current.next;// bypass it
        return current;
    }
}
