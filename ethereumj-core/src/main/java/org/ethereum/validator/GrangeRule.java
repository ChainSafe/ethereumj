package org.ethereum.validator;

import org.ethereum.config.SystemProperties;
import org.ethereum.core.BlockHeader;
import org.ethereum.core.BlockSummary;
import org.ethereum.listener.CompositeEthereumListener;
import org.ethereum.listener.EthereumListenerAdapter;
import org.ethereum.mine.EthashValidationHelper;

import static org.ethereum.validator.EthashRule.ChainType.main;
import static org.ethereum.validator.EthashRule.ChainType.reverse;
import static org.ethereum.validator.EthashRule.Mode.fake;
import static org.ethereum.validator.EthashRule.Mode.mixed;

/**
 * Created by tim on 2018-11-25.
 */

public class GrangeRule extends BlockHeaderRule {

    public static GrangeRule createRegular() {
        return new GrangeRule();
    }

    public GrangeRule() {

    }

    @Override
    public ValidationResult validate(BlockHeader header) {

        return Success;
    }
}
