package project.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import project.dto.DiaryDto;
import project.dto.GoalDto;
import project.dto.MoodDto;
import project.dto.ShareMemberDto;
import project.dto.ShareRoomDto;
import project.dto.WeatherDto;
import project.security.JwtTokenUtil;
import project.service.DiaryService;

@Slf4j
@RestController
public class DiaryApiController {
	@Autowired
	private DiaryService diaryService;

	@Autowired
	private JwtTokenUtil jwtTokenUtil;

//	@PostMapping("/api/regist")
//	public ResponseEntity<Object> regist(@RequestBody MemberDto memberDto) throws Exception {
//		int registedCount = loginService.registUser(memberDto);
//		if (registedCount > 0) {
//			return ResponseEntity.status(HttpStatus.CREATED).body(registedCount);
//		} else {
//			return ResponseEntity.status(HttpStatus.OK).body(registedCount);
//		}
//	}

	@GetMapping("/api/someus/private/page/{memberId}")
	public ResponseEntity <Map<String, Object>> openPrivateList(@PathVariable ("memberId") String memberId) throws Exception {
		
		Map <String, Object> result = new HashMap<>();
		List<DiaryDto> list1 = diaryService.selectPrivateList(memberId);
		List<GoalDto> list2 = diaryService.selectGoalList(memberId);
		
		result.put("diaryList", list1);
		result.put("goalList", list2);
		
//		result.containsKey("diaryList") == true && result.containsKey("goalList") == true
		if (result.size() == 2) {
			return ResponseEntity.status(HttpStatus.OK).body(result);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		
	}
//	
//	@GetMapping("/api/someus/private")
//	public ResponseEntity<List<GoalDto>> openGoalList() throws Exception {
//		List<GoalDto> list = diaryService.selectGoalList();
//		if (list != null && list.size() > 0) {
//			return ResponseEntity.status(HttpStatus.OK).body(list);
//		} else {
//			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
//		}
//	}
	
	// 글쓰기 화면 요청 시 날씨, 기분 선택 넘기기 위함
	@GetMapping("api/someus/private/write")
	public ResponseEntity<Map<String, Object>> writePrivate() throws Exception{
		
		Map<String, Object> result = new HashMap<>();
		List<WeatherDto> weatherList = diaryService.weatherList();
		List<MoodDto> moodList = diaryService.moodList();
		
		result.put("weatherList", weatherList);
		result.put("moodList", moodList);
		
		if (weatherList != null && moodList !=null) {
			return ResponseEntity.status(HttpStatus.OK).body(result);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
	}

//	@PostMapping("/api/someus/private/write")
//	public ResponseEntity<Map<String, Object>> insertPrivate(@RequestPart(value = "files", required = false) MultipartFile file, @RequestPart(value = "data", required = false) DiaryDto diaryDto, HttpServletRequest request)
//			throws Exception {
//		String jwtToken = null;
//		String subject = null;
//		String authorizationHeader = request.getHeader(HttpHeaders.AUTHORIZATION);
//		if (authorizationHeader != null && authorizationHeader.startsWith("Bearer")) {
//			jwtToken = authorizationHeader.substring(7);
//			subject = jwtTokenUtil.getSubjectFromToken(jwtToken);
//		}
//		diaryDto.setMemberId(subject);
//		
//		String FileNames = "";
//		String filepath = "C:/java/eclipse-workspace/someus/img";
//		String returnFileName="";
//		
//		String originFileName = file.getOriginalFilename(); // 원본 파일 명
//		long fileSize = file.getSize(); // 파일 사이즈
//
//		System.out.println("originFileName : " + originFileName);
//		System.out.println("fileSize : " + fileSize);
//		String safeFile = System.currentTimeMillis() + originFileName;
//		returnFileName = safeFile.toString();
//
//		diaryDto.setDiaryImg(returnFileName);
//		
//		int insertedCount = 0;
//		
//		try {
//			insertedCount = diaryService.insertPrivate(diaryDto, file);
//			if (insertedCount > 0) {
//				Map<String, Object> result = new HashMap<>();
//				result.put("message", "정상적으로 등록되었습니다.");
//				result.put("count", insertedCount);
//				result.put("diaryId", diaryDto.getDiaryId());
//				return ResponseEntity.status(HttpStatus.OK).body(result);
//			} else {
//				Map<String, Object> result = new HashMap<>();
//				result.put("message", "등록된 내용이 없습니다.");
//				result.put("count", insertedCount);
//				return ResponseEntity.status(HttpStatus.OK).body(result);
//			}
//		} catch (Exception e) {
//			Map<String, Object> result = new HashMap<>();
//			result.put("message", "등록 중 오류가 발생했습니다.");
//			result.put("count", insertedCount);
//			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(result);
//		}
//		return null;
//		
//	}

		
		
		
//		int insertedCount = 0;
//		try {
//			insertedCount = diaryService.insertPrivate(diaryDto, mf);
//			if (insertedCount > 0) {
//				Map<String, Object> result = new HashMap<>();
//				result.put("message", "정상적으로 등록되었습니다.");
//				result.put("count", insertedCount);
//				result.put("diaryId", diaryDto.getDiaryId());
//				return ResponseEntity.status(HttpStatus.OK).body(result);
//			} else {
//				Map<String, Object> result = new HashMap<>();
//				result.put("message", "등록된 내용이 없습니다.");
//				result.put("count", insertedCount);
//				return ResponseEntity.status(HttpStatus.OK).body(result);
//			}
//		} catch (Exception e) {
//			Map<String, Object> result = new HashMap<>();
//			result.put("message", "등록 중 오류가 발생했습니다.");
//			result.put("count", insertedCount);
//			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(result);
//		}
//	}}

	@GetMapping("/api/someus/private/{diaryId}")
	public ResponseEntity<DiaryDto> openPrivateDetail(@PathVariable("diaryId") int diaryId) throws Exception {
		DiaryDto diaryDto = diaryService.selectPrivateDetail(diaryId);
		if (diaryDto == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		} else {
			return ResponseEntity.status(HttpStatus.OK).body(diaryDto);
		}

	}

	@PutMapping("/api/someus/private/{diaryId}")
	public ResponseEntity<Integer> updatePrivate(@PathVariable("diaryId") int diaryId, @RequestBody DiaryDto diaryDto)
			throws Exception {
		diaryDto.setDiaryId(diaryId);
		int updatedCount = diaryService.updatePrivate(diaryDto);
		if (updatedCount != 1) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(updatedCount);
		} else {
			return ResponseEntity.status(HttpStatus.OK).body(updatedCount);
		}

	}

	@DeleteMapping("/api/someus/private/{diaryId}")
	public ResponseEntity<Integer> deletePrivate(@PathVariable("diaryId") int diaryId) throws Exception {
		int deletedCount = diaryService.deletePrivate(diaryId);
		if (deletedCount != 1) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(deletedCount);
		} else {
			return ResponseEntity.status(HttpStatus.OK).body(deletedCount);
		}
	}

	// 개인 목표 기능

	// 교환 일기 기능

	@GetMapping("/api/someus/share/grouplist")
	public ResponseEntity<List<ShareRoomDto>> openGroupList() throws Exception {

		List<ShareRoomDto> list = diaryService.selectPublicList();
		if (list != null && list.size() > 0) {
			return ResponseEntity.status(HttpStatus.OK).body(list);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
	}

	@GetMapping("/api/someus/share/groupsharelist")
	public ResponseEntity<List<ShareMemberDto>> openGroupShareList() throws Exception {

		List<ShareMemberDto> list = diaryService.selectPublicShareList();
		if (list != null && list.size() > 0) {
			return ResponseEntity.status(HttpStatus.OK).body(list);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
	}

	@GetMapping("api/someus/share/write")
	public ResponseEntity<Map<String, Object>> writePublic() throws Exception{
		
		Map <String, Object> result = new HashMap<>();
		List<WeatherDto> weatherList = diaryService.weatherList();
		List<MoodDto> moodList = diaryService.moodList();
		
		result.put("weatherList", weatherList);
		result.put("moodList", moodList);
		
		if (weatherList != null && moodList !=null) {
			return ResponseEntity.status(HttpStatus.OK).body(result);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
	}
	
	@PostMapping("/api/someus/share/write")
	public ResponseEntity<Map<String, Object>> insertPublic(@RequestBody DiaryDto diaryDto, HttpServletRequest request)
			throws Exception {
		String jwtToken = null;
		String subject = null;
		String authorizationHeader = request.getHeader(HttpHeaders.AUTHORIZATION);
		if (authorizationHeader != null && authorizationHeader.startsWith("Bearer")) {
			jwtToken = authorizationHeader.substring(7);
			subject = jwtTokenUtil.getSubjectFromToken(jwtToken);
		}
		diaryDto.setMemberId(subject);

		int insertedCount = 0;
		try {
			insertedCount = diaryService.insertPublic(diaryDto);
			if (insertedCount > 0) {
				Map<String, Object> result = new HashMap<>();
				result.put("message", "정상적으로 등록되었습니다.");
				result.put("count", insertedCount);
				result.put("diaryId", diaryDto.getDiaryId());
				return ResponseEntity.status(HttpStatus.OK).body(result);
			} else {
				Map<String, Object> result = new HashMap<>();
				result.put("message", "등록된 내용이 없습니다.");
				result.put("count", insertedCount);
				return ResponseEntity.status(HttpStatus.OK).body(result);
			}
		} catch (Exception e) {
			Map<String, Object> result = new HashMap<>();
			result.put("message", "등록 중 오류가 발생했습니다.");
			result.put("count", insertedCount);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(result);
		}
	}

	@GetMapping("/api/someus/share/{shareRoomId}")
	public ResponseEntity<List<DiaryDto>> openPublicDetail(@PathVariable("shareRoomId") int shareRoomId)
			throws Exception {
		List<DiaryDto> diaryDto = diaryService.selectPublicDetail(shareRoomId);
		if (diaryDto == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		} else {
			return ResponseEntity.status(HttpStatus.OK).body(diaryDto);
		}

	}

	@PutMapping("/api/someus/share/{shareRoomId}/{diaryId}")
	public ResponseEntity<Integer> updatePublic(@PathVariable("shareRoomId") int shareRoomId,
			@PathVariable("diaryId") int diaryId, @RequestBody DiaryDto diaryDto) throws Exception {
		diaryDto.setDiaryId(diaryId);
		diaryDto.setShareRoomId(shareRoomId);

		log.debug(">>>>>>>>>>>>>>>>>");
		log.debug(diaryDto.toString());

		int updatedCount = diaryService.updatePublic(diaryDto);
		if (updatedCount != 1) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(updatedCount);
		} else {
			return ResponseEntity.status(HttpStatus.OK).body(updatedCount);
		}

	}

//	@DeleteMapping("/api/someus/share/{shareRoomId}/{diaryId}")
//	public ResponseEntity<Integer> deletePublic(@PathVariable("shareRoomId") int shareRoomId,
//			@PathVariable("diaryId") int diaryId) throws Exception {
//		
////		int deletedCount = diaryService.deletePublic(diaryDto);
//		int deletedCount = diaryService.deletePublic(shareRoomId, diaryId);
//		
//		if (deletedCount != 1) {
//			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(deletedCount);
//		} else {
//			return ResponseEntity.status(HttpStatus.OK).body(deletedCount);
//		}
//	}
	
	@PostMapping("/api/someus/addgroup/{shareRoomId}")
	public ResponseEntity<List<ShareRoomDto>> insertAddGroup(@RequestBody ShareRoomDto shareRoomDto, HttpServletRequest request)
			throws Exception {
		
		List<ShareRoomDto> list = diaryService.insertAddGroup(shareRoomDto);

		if (list == null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		} else {
			return ResponseEntity.status(HttpStatus.OK).body(list);
		}
	}

	

}