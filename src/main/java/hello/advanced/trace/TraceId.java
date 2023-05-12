package hello.advanced.trace;

import java.util.UUID;

public class TraceId {

    private String id;
    private int level;

    public TraceId() {
        this.id = createId();
        this.level = 0;
    }

    private TraceId(String id, int level) {
        this.id = id;
        this.level = level;
    }

    /**
     * 트랜잭션ID 생성 (UUID 앞 8자리만 사용)
     * @return
     */
    private String createId() {
        return UUID.randomUUID().toString().substring(0, 8);
    }

    /**
     * 트랜잭션ID는 똑같고 로그의 Depth를 늘린다.
     */
    private TraceId createNextId() {
        return new TraceId(id, level + 1);
    }

    /**
     * 트랜잭션ID는 똑같고 로그의 Depth를 줄인다.
     */
    private TraceId createPreviousId() {
        return new TraceId(id, level - 1);
    }

    /**
     * 첫번째 레벨인지 확인
     */
    public boolean isFirstLevel() {
        return level == 0;
    }

    public String getId() {
        return id;
    }

    public int getLevel() {
        return level;
    }
}
