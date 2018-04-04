package springbootapp.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topics> topics= new ArrayList<>(Arrays.asList(
			new Topics("Spring", "Spring Framework","Description"),
			new Topics("Hibernate", "Hibernate Framework","Description"),
			new Topics("Struts", "Struts Framework","Description")
			));
	
	public List<Topics> getTopics() {
		return topics;
	}
	
	public Topics getTopics(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topics topic) {
		topics.add(topic);		
	}
	
	public void updateTopic(String id, Topics topic) {
		for(int i=0; i<topics.size(); i++) {
			Topics t=topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i,topic);
				return;
			}
		}
	}

	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
	}
}
