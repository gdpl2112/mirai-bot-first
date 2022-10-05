package io.github.kloping.mirai0.commons.gameEntitys.challange;

import java.util.HashMap;
import java.util.Map;

import static io.github.kloping.mirai0.commons.gameEntitys.challange.AbstractChallenge.ACCEPTING;
import static io.github.kloping.mirai0.commons.gameEntitys.challange.AbstractChallenge.STATE_CREATED;

/**
 * @author github.kloping
 */
public class Challenges {
    public final Map<Long, Long> Q2Q = new HashMap<>();
    //q1 所在的 挑战
    public final Map<Long, AbstractChallenge> Q2C = new HashMap<>();

    public synchronized boolean contains(long q) {
        return Q2Q.containsKey(q);
    }

    public AbstractChallenge getChallenge(long q) {
        return Q2C.get(q);
    }

    public synchronized void destroy(long qid) throws Exception {
        if (!contains(qid)) return;
        long q1 = qid;
        long q2 = Q2Q.get(q1);
        Q2Q.remove(q1);
        Q2C.remove(q1);
        Q2Q.remove(q2);
        Q2C.remove(q2);
    }


    public synchronized void append(AbstractChallenge challenge) {
        Q2Q.put(challenge.p1, challenge.p2);
        Q2Q.put(challenge.p2, challenge.p1);
    }

    /**
     * q1 join q2
     *
     * @param q1
     * @param q2
     */
    public boolean join(long q1, long q2) {
        if (q1 == q2) return false;
        if (Q2C.containsKey(q2)) {
            AbstractChallenge challenge = Q2C.get(q2);
            if (challenge.state == ACCEPTING) {
                challenge.p2 = q1;
                Q2C.put(q1, challenge);
                if (challenge.ready()) {
                    append(challenge.start());
                }
                return true;
            }
        }
        return false;
    }

    public synchronized void create(long q, AbstractChallenge challenge) {
        Q2C.put(q, challenge);
        challenge.p1 = q;
        challenge.state = ACCEPTING;
    }
}
