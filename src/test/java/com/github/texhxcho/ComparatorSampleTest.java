package com.github.texhxcho;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/**
 * com.github.texhxcho
 *
 * @author texhxcho@sk.com
 * @since 2019-07-30
 */
public class ComparatorSampleTest {

    private ComparatorSample comparatorSample;

    @Test
    public void comparatorTest() {

        List<CObject> list = Arrays.asList(CObject.builder().data(1L).build(),
            CObject.builder().data(4L).build(),
            CObject.builder().data(5L).build(),
            CObject.builder().data(6L).build());

        List<CObject> sortAndReverseResult = comparatorSample.collectionSortAndReverse(list);
        List<CObject> reverseResult = comparatorSample.collectionReverse(list);
        List<CObject> reverseLambdaResult = comparatorSample.collectionReverseLambda(list);

        Assert.assertEquals(Arrays.asList(sortAndReverseResult), Arrays.asList(reverseResult));
        Assert.assertEquals(Arrays.asList(reverseResult), Arrays.asList(reverseLambdaResult));

        list.stream().forEach(e -> {
            System.out.println(e.getData());
        });
    }
}