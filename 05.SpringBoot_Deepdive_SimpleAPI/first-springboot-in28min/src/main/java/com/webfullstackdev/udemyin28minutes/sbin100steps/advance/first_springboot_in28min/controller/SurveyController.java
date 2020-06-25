package com.webfullstackdev.udemyin28minutes.sbin100steps.advance.first_springboot_in28min.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.webfullstackdev.udemyin28minutes.sbin100steps.advance.first_springboot_in28min.model.Question;
import com.webfullstackdev.udemyin28minutes.sbin100steps.advance.first_springboot_in28min.service.SurveyService;

@RestController
public class SurveyController {
	@Autowired
	private SurveyService surveyService;
	
	
	//GET "/surveys/{surveyId}/questions"
	@GetMapping("/surveys/{surveyId}/questions")
	public List<Question> retriveQuestionsForSurvey(@PathVariable String surveyId){
		
		return surveyService.retrieveQuestions(surveyId);
	}
	
	@PostMapping("/surveys/{surveyId}/questions")
    ResponseEntity<?> add(@PathVariable String surveyId,  @RequestBody Question question) {

        Question createdTodo = surveyService.addQuestion(surveyId, question);

        if (createdTodo == null) {
            return ResponseEntity.noContent().build();
        }

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(createdTodo.getId()).toUri();

        return ResponseEntity.created(location).build();

    }

	//GET "/surveys/{surveyId}/questions/{questionsId}"
	@GetMapping(path = "/surveys/{surveyId}/questions/{questionId}")
	public Question retrieveQuestion(@PathVariable String surveyId,   @PathVariable String questionId) {
	     return surveyService.retrieveQuestion(surveyId, questionId);
	}

}
