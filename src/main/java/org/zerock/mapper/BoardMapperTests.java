package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {

	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
	
	@Test
	public void testGetList() {
		
		/*
		 List<BoardVO> boardList = mapper.getList(); 
		 for (BoardVO board : boardList) {
		  		log.info(board); 
		 }
		 */
		mapper.getList().forEach(board -> log.info(board));
	}
	
	/*
	 * @Test public void testInsert() {
	 * 
	 * BoardVO board = new BoardVO(); board.setTitle("���� �ۼ��ϴ� ��");
	 * board.setContent("���� �ۼ��ϴ� ����"); board.setWriter("newbie");
	 * 
	 * mapper.insert(board);
	 * 
	 * log.info(board); }
	 * 
	 * @Test public void testInsertSelectKey() {
	 * 
	 * BoardVO board = new BoardVO(); board.setTitle("���� �ۼ��ϴ� �� select key");
	 * board.setContent("���� �ۼ��ϴ� ���� select key"); board.setWriter("newbie");
	 * 
	 * mapper.insertSelectKey(board);
	 * 
	 * log.info(board); }
	 */
	
	/*
	 * @Test public void testRead() {
	 * 
	 * // �����ϴ� �Խù� ��ȣ�� �׽�Ʈ BoardVO board = mapper.read(5L);
	 * 
	 * log.info(board); }
	 */
	
	
	  @Test 
	  public void testDelete() {	  
		  log.info("DELETE COUNT: " + mapper.delete(3L)); 
	  }
	  
	/*
	 * @Test public void testUpdate() {
	 * 
	 * BoardVO board = new BoardVO();
	 * 
	 * //������ �����ϴ� ��ȣ���� Ȯ���� �� board.setBno(5L); board.setTitle("������ ����");
	 * board.setContent("������ ����"); board.setWriter("user01");
	 * 
	 * int count = mapper.update(board); log.info("UPDATE COUNT : " + count); }
	 */
	 
	
}
