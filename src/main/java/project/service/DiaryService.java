package project.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import project.dto.DiaryDto;
import project.dto.GoalDto;
import project.dto.MoodDto;
import project.dto.ShareMemberDto;
import project.dto.ShareRoomDto;
import project.dto.WeatherDto;

public interface DiaryService {
	
	public List<DiaryDto> selectPrivateList(String memberId) throws Exception;
	
	public List<GoalDto> selectGoalList(String memberId) throws Exception;
	
	public int insertGoal(GoalDto goaldto) throws Exception;
	
	public int updateGoal(String memberId) throws Exception;
	
	// 특정 날짜를 선택했을 때 반환되는 결과
	public List<DiaryDto> selectPrivateByCreatedDb(String createdDt) throws Exception;
	
	// 날씨 선택 화면 출력
	public List<WeatherDto> weatherList() throws Exception;
	 
	 // 기분 선택 화면 출력
	public List<MoodDto> moodList() throws Exception;
	
	public int insertPrivate(DiaryDto diaryDto, MultipartFile files) throws Exception;
	String saveFile(MultipartFile file) throws Exception;
	
	public DiaryDto selectPrivateDetail(int diaryId) throws Exception;
	
	public int updatePrivate(DiaryDto diaryDto) throws Exception;
	
	public int deletePrivate(int diaryId) throws Exception;
	
	public List<ShareRoomDto> selectPublicList() throws Exception;
	
	public List<ShareMemberDto> selectPublicShareList() throws Exception;
	
	public int insertPublic(DiaryDto diaryDto) throws Exception;
	
	public List<DiaryDto> selectPublicDetail(int shareRoomId) throws Exception;
	
	public int updatePublic(DiaryDto diaryDto) throws Exception;
	
//	public int deletePublic(int shareRoomId, int diaryId) throws Exception;
////	
//	public int deletePublic(DiaryDto diaryDto) throws Exception;
//	
	public ShareRoomDto selectAddGroup() throws Exception;
	
	public List<ShareRoomDto> insertAddGroup(ShareRoomDto shareRoomDto) throws Exception;
	
	public List<GoalDto> selectGoalList() throws Exception;
}
