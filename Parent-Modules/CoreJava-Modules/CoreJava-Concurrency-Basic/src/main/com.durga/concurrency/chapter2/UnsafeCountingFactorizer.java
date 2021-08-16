package concurrency.chapter2;

import concurrency.annotation.NotThreadSafe;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.math.BigInteger;



/**
 * 2-2 在没有同步的情况下统计已处理请求数量的Servlet(不要这么做)
 * @author Swift Hu
 * @date 2018年9月11日 下午8:50:18 
 */
@NotThreadSafe
public class UnsafeCountingFactorizer extends AbstractFactorizer {

	private long count = 0;

	public long getCount() {
		return count;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		BigInteger i = extractFromRequest(req);
		BigInteger[] factors = factor(i);
		++count;
		encodeIntoResponse(res, factors);
	}

}
