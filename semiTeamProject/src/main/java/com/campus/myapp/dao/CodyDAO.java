package com.campus.myapp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.campus.myapp.vo.CodyVO;

@Mapper
@Repository
public interface CodyDAO {
	//�ڵ� ��õ �̹��� ����Ʈ ��������
	public List<CodyVO> codyRecommend(int temp, String sex);
	//�ڵ� �߰�
	public int codyInsert(CodyVO vo);
	//cname �ߺ�Ȯ��
	public int cnameCheck(String cname);
}