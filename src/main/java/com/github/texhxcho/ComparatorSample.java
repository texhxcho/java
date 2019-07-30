package com.github.texhxcho;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import lombok.Builder;
import lombok.Getter;


/**
 * com.github.texhxcho
 *
 * @author texhxcho@sk.com
 * @since 2019-07-24
 */
public class ComparatorSample {

    public static List<CObject> collectionSortAndReverse(List<CObject> list) {
        Collections.sort(list, new Comparator<CObject>() {
            @Override
            public int compare(CObject o1, CObject o2) {
                return o1.getData().compareTo(o2.getData());
            }
        });

        Collections.reverse(list);

        return list;
    }

    public static List<CObject> collectionReverse(List<CObject> list) {
        Collections.sort(list, new Comparator<CObject>() {
            @Override
            public int compare(CObject o1, CObject o2) {
                return o2.getData().compareTo(o1.getData());
            }
        });

        return list;
    }

    public static List<CObject> collectionReverseLambda(List<CObject> list) {
        list.sort((CObject o1, CObject o2) -> o2.getData().compareTo(o1.getData()));
        return list;
    }

}

@Builder
@Getter
class CObject {

    private Long data;
}
