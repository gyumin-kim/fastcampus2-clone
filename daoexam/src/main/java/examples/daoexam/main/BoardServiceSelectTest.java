package examples.daoexam.main;

import examples.daoexam.config.ApplicationConfig;
import examples.daoexam.dto.Board;
import examples.daoexam.service.BoardService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

public class BoardServiceSelectTest {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		BoardService boardService = context.getBean(BoardService.class);
		Board board = boardService.getBoard(1L);

		System.out.println(board);
	}
}
