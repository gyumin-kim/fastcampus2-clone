package examples.first.io;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TeamSelector {
    public static void main(String[] args){
        String[] members = new String[]{ "김규민", "김준형", "윤지수", "배대준", "신윤철", "장태희", "장현준", "정시윤", "주미선", "김남환", "최재용"};
        List<String> list = Arrays.asList(members);
        Collections.shuffle(list);

        int count = 1;
        for(String name : list){
            System.out.print(name + " ");
            if(count % 4 == 0)
                System.out.println();
            count++;
        }
        System.out.println();
    }
}
