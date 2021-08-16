package newfeatures;

import domain.Movie;
import util.MovieUtil;

import java.util.List;

import static java.util.stream.Collectors.toList;



/**
 * Example for demontrating streams feature
 * @author durga on 8/16/2021
 *
 */
public class ParallelStreamsFeature {

	/**
	 * Finding classics running parallel
	 * @param movies
	 * @return
	 */
	public List<Movie> findClassics(List<Movie> movies) {
		return movies
			.stream()
			.parallel()
			.filter(m -> m.isClassic())
			.collect(toList());
	}

	/**
	 * Finding classics using parallelStream
	 * @param movies
	 * @return
	 */
	public List<Movie> findClassics2(List<Movie> movies) {
		return movies
			.parallelStream()
			.filter(m -> m.isClassic())
			.collect(toList());
	}

	public static void main(String[] args) {
		List<Movie> movies = MovieUtil.createMovies();
		List<Movie> classics = new ParallelStreamsFeature().findClassics(movies);
		classics.forEach(System.out::println);
	}
}
