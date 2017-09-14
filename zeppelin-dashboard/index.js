import Visualization from 'zeppelin-vis'

export default class ZeppelinDashboard extends Visualization {


    constructor(targetEl, config) {
        super(targetEl, config);

        const spec = {

        };

        this.transformation = new AdvancedTransformation(config, spec);
    }

}