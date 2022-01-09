package com.example.kotlinsample;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    // 주연
    public List<Actor> leadingActors;
    // 조연
    public List<Actor> supportingActors;

    // 제목
    public String title;

    // 상영연도
    public int showingAge;

    // 장르 - 공포, 코미디, 액션
    public String genre;

    // 배우 클래스
    public static class Actor {
        // 본명
        public String realName;
        // 예명
        public String stageName;
        // 나이
        public int age;

        // 성별 남자-N, 여자-W
        public String gender;

        // 출연작
        public List<Movie> actedMovies;
    }
    // 배우 캐스팅 후보를 반환하는 함수
    // 전달받은 영화 목록 중 제목에 '도시' 문자열이 있는 영화만 조사
    // 주연배우 목록에서 여성 20대, 작품수 5개 이상이면 추천
    // 조연배우 목록에서 남성 30대, 출연작품 중 공포 장르가 3개 이상인 경우 추천

    public static List<Actor> casting(List<Movie> movies) {
        List<Actor> recommendActors = new ArrayList<>();

        // 전달받은 Movie 목록을 순회
        for (Movie movie : movies) {
            if (movie.title.contains("도시")) {
                for (Actor actor : movie.leadingActors) {
                    if (actor.gender.equals("W") && actor.actedMovies.size() >= 5 && actor.age >= 20 && actor.age < 30) {
                        recommendActors.add(actor);
                    }

                }
                for (Actor actor : movie.supportingActors) {
                    if (actor.gender.equals("M") && actor.age >= 30 && actor.age < 40) {
                        for (Movie actedMovies : actor.actedMovies) {
                            if (actedMovies.genre.equals("공포")) {
                                recommendActors.add(actor);
                            }
                        }
                    }
                }
            }
        }
        return recommendActors;
    }
}
 /*
 고려해야 할 null 사항

 1. 전달받은 함수의 파라미터인 movies 리스트 null 체크
 2. Java 는 list 에 null 항목을 추가가능하므로 movies 의 각 원소 널 체크
 3. 각 movie 의  title 널 체크
 4.  각 movie 의  주연배우 리스트 널 체크
 ... 등등

 => 널체크 코드 너무 많이 쓰면 가독성 떨어짐
 */
