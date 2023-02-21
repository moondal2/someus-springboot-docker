package project.service;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import project.dto.DiaryDto;
import project.dto.GoalDto;
import project.dto.MoodDto;
import project.dto.ShareMemberDto;
import project.dto.ShareRoomDto;
import project.dto.WeatherDto;
import project.mapper.DiaryMapper;

@Service
public class DiaryServiceImpl implements DiaryService {

	@Autowired
	private DiaryMapper diaryMapper;
	
	@Value("${application.upload-path}")
	private String uploadPath;

	
	@Override
	public List<DiaryDto> selectPrivateList(String memberId) throws Exception{
		return diaryMapper.selectPrivateList( memberId);
	}
	
	@Override
	public List<GoalDto> selectGoalList(String memberId) throws Exception {
		return diaryMapper.selectGoalList(memberId);
	}
	
	@Override
	public int insertGoal(GoalDto goalDto) throws Exception {
		return diaryMapper.insertGoal(goalDto);
	}
	
	@Override
	public int updateGoal(String memberId) throws Exception {
		return diaryMapper.updateGoal(memberId);
	}
	// 특정 날짜를 선택했을 때 반환되는 결과
	public List<DiaryDto> selectPrivateByCreatedDb(String createdDt) throws Exception {
		return diaryMapper.selectPrivateByCreatedDb(createdDt);
	}
	
	// 날씨 선택 화면 출력
	public List<WeatherDto> weatherList() throws Exception {
		return diaryMapper.weatherList();
	}
	 
	// 기분 선택 화면 출력
	public List<MoodDto> moodList() throws Exception{
		return diaryMapper.moodList();
	}
	
	@Override
	public int insertPrivate(DiaryDto diaryDto, MultipartFile file) throws Exception{
		String savedFilePath = saveFile(file);
		diaryDto.setDiaryImg(savedFilePath);
		
		return diaryMapper.insertPrivate(diaryDto);
	}
	
	@Override
	public DiaryDto selectPrivateDetail(int diaryId) throws Exception {
		return diaryMapper.selectPrivateDetail(diaryId);
	}
	
	@Override
	public int updatePrivate(DiaryDto diaryDto) throws Exception{
		return diaryMapper.updatePrivate(diaryDto);
	}
	
	@Override
	public int deletePrivate(int diaryId) throws Exception{
		return diaryMapper.deletePrivate(diaryId);
	}
	
	@Override
	public List<ShareRoomDto> selectPublicList() throws Exception{
		return diaryMapper.selectPublicList();
	}
	
	@Override
	public List<ShareMemberDto> selectPublicShareList() throws Exception{
		return diaryMapper.selectPublicShareList();
	}
	
	@Override
	public int insertPublic(DiaryDto diaryDto) throws Exception {
		return diaryMapper.insertPublic(diaryDto);
	}
	
	@Override
	public List<DiaryDto> selectPublicDetail(int shareRoomId) throws Exception {
		return diaryMapper.selectPublicDetail(shareRoomId);
	}
	
	@Override
	public int updatePublic(DiaryDto diaryDto) throws Exception{
		return diaryMapper.updatePublic(diaryDto);
	}
	
//	@Override
//	public int deletePublic(int shareRoomId, int diaryId) throws Exception{
//		return diaryMapper.deletePublic(shareRoomId, diaryId);
//	}
	
//	@Override
//	public int deletePublic(DiaryDto diaryDto) throws Exception{
//		return diaryMapper.deletePublic(diaryDto);
//	}
	
	@Override
	public ShareRoomDto selectAddGroup() throws Exception {
		return diaryMapper.selectAddGroup();
	}
	
	@Override
	public List<ShareRoomDto> insertAddGroup(ShareRoomDto shareRoomDto) throws Exception {
		return diaryMapper.insertAddGroup(shareRoomDto);
	}
	
	@Override
	public List<GoalDto> selectGoalList() throws Exception {
		return diaryMapper.selectGoalList();
	}

	@Override
	public String saveFile(MultipartFile file) throws Exception {
		String savedFilePath = uploadPath + file.getOriginalFilename();

		File uploadFile = new File(savedFilePath);
		file.transferTo(uploadFile);

		return savedFilePath;
	}
}

