package methodmultiplereturnvalues;

import java.util.List;

/**
 * @author durga on 8/12/2021
 */
public class MultipleReturnValuesUsingTuples {
    static Tuple2<Coordinates, Double> getMostDistantPoint(List<Coordinates> coordinatesList,
                                                           Coordinates target) {

        return coordinatesList.stream()
                .map(coor -> new Tuple2<>(coor, coor.calculateDistance(target)))
                .max((d1, d2) -> Double.compare(d1.getSecond(), d2.getSecond()))
                .get();

    }
}
