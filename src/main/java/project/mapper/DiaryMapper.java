package project.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.multipart.MultipartFile;

import project.dto.DiaryDto;
import project.dto.GoalDto;
import project.dto.MoodDto;
import project.dto.ShareMemberDto;
import project.dto.ShareRoomDto;
import project.dto.WeatherDto;

@Mapper
public interface DiaryMapper {

	 List<DiaryDto> selectPrivateList(String memberId) throws Exception;
	 
	 List<GoalDto> selectGoalList(String memberId) throws Exception;
	 
	 int insertGoal(GoalDto goalDto) throws Exception;
	 
	 int updateGoal(String memberId) throws Exception;
	 
	 //	특정 날짜를 선택했을 때 반환되는 결과
	 List<DiaryDto> selectPrivateByCreatedDb(String createdDt) throws Exception;
	 
	 // 날씨 선택 화면 출력
	 List<WeatherDto> weatherList() throws Exception;
	 
	 // 기분 선택 화면 출력
	 List<MoodDto> moodList() throws Exception;

	 int insertPrivate(DiaryDto diaryDto) throws Exception;
	 String saveFile(MultipartFile file) throws Exception;
	 
	 DiaryDto selectPrivateDetail(int diaryId) throws Exception;
	 
	 int updatePrivate(DiaryDto diaryDto) throws Exception;
	 
	 int deletePrivate(int diaryId) throws Exception;
	 
	 List<ShareRoomDto> selectPublicList() throws Exception;
	 
	 List<ShareMemberDto> selectPublicShareList() throws Exception;
	 
	 int insertPublic(DiaryDto diaryDto) throws Exception;
	 
	 List<DiaryDto> selectPublicDetail(int shareRoomId) throws Exception;
	 
	 int updatePublic(DiaryDto diaryDto) throws Exception;
	 
	 // int deletePublic(@Param("shareRoomId") int shareRoomId, @Param("diaryId") int diaryId) throws Exception;

	 //	 int deletePublic(DiaryDto diaryDto) throws Exception;
	 
	 ShareRoomDto selectAddGroup() throws Exception;
	 
	 List<ShareRoomDto> insertAddGroup(ShareRoomDto shareRoomDto) throws Exception;
	 
	 List<GoalDto> selectGoalList() throws Exception;
	 
//	 List<DiaryDto> selectGoalList (int diaryId) throws Exception;
	 
}
