package juice;

import java.util.Comparator;

public class ComponentComparator implements Comparator <Juice>{
        @Override
        public int compare (Juice ob1, Juice ob2){
            return ob1.getComponents().size() - ob2.getComponents().size();
        }
}
