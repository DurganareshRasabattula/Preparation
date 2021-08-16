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
public class StreamsFeature {

	/**
	 * Finding classics 
	 * @param movies
	 * @return
	 */
	public List<Movie> findClassics(List<Movie> movies) {
		return movies
			.stream()
			.filter(m -> m.isClassic())
			.collect(toList());
	}

	public static void main(String[] args) {
		List<Movie> movies = MovieUtil.createMovies();
		List<Movie> classics = new StreamsFeature().findClassics(movies);
		classics.forEach(System.out::println);
	}
}
