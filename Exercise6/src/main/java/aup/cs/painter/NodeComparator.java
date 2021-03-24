package aup.cs.painter;

import java.util.Comparator;

public class NodeComparator implements Comparator<Node> {
        @Override
        public int compare(Node o1, Node o2) {
            if(o1 instanceof Panel && o2 instanceof Panel) {
                return o1.getHeight() - o2.getHeight();
            }
            if(o1 instanceof Panel) {
                return 1;
            }
            else if(o2 instanceof Panel) {
                return -1;
            }
            return o1.getHeight() - o2.getHeight();
        }
}
