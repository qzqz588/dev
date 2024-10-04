package CH32_;
//자바 스트림(Stream)은 자바 8부터 도입된 기능으로,
//컬렉션(Collection)을 처리하고 변환하기 위한 강력한 기능을 제공합니다.
//스트림을 사용하면 데이터를 효율적으로 처리하고 다양한 연산을 수행할 수 있습니다.
//다음은 자바 스트림에서 제공하는 주요 함수 종류입니다:
//
//중개 연산(Intermediate operations):
//-스트림의 요소를 변환하거나 필터링하는 작업을 수행,파이프라인에 의해 여러번 호출 가능
//-중개 연산만으로는 실제로 데이터가 처리되지 않으며, 최종 연산이 호출될 때까지 연산이 지연
//
//		filter: 주어진 조건에 맞는 요소를 선택합니다.(중요!!!!!!!!!!)
//		map: 요소를 다른 형태로 변환합니다.(중요!!!!!!!!!!)
//		flatMap: 각 요소를 변환하고, 이를 하나의 스트림으로 평면화합니다.
//		distinct: 중복된 요소를 제거합니다.
//		sorted: 요소를 정렬합니다.
//		limit: 주어진 개수만큼 요소를 제한합니다.
//		skip: 처음 몇 개의 요소를 제외하고 반환합니다.
//
//최종 연산(Terminal operations):
//		forEach: 각 요소를 반복적으로 처리합니다.(중요!!!!)
//		collect: 요소를 수집하여 새로운 컬렉션을 생성합니다.(중요!!!!!!!)
//		reduce: 요소를 하나로 줄여서 결과를 반환합니다.(중요!!!!!!!)
//		min: 최소값을 반환합니다.
//		max: 최대값을 반환합니다.
//		count: 요소의 개수를 반환합니다.
//		anyMatch: 하나 이상의 요소가 주어진 조건과 일치하는지 검사합니다.
//		allMatch: 모든 요소가 주어진 조건과 일치하는지 검사합니다.
//		noneMatch: 모든 요소가 주어진 조건과 일치하지 않는지 검사합니다.
//		findFirst: 첫 번째 요소를 반환합니다.
//		findAny: 임의의 요소를 반환합니다.
public class C00INFO {

}