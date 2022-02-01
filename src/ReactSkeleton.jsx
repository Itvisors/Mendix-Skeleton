import "./ui/ReactSkeleton.css";
import { Component, createElement } from "react";
import Skeleton from "@material-ui/lab/Skeleton";

export default class ReactSkeleton extends Component {
    constructor(props) {
        super(props);

        this.state = {
            value: undefined
        };
    }

    //to-do
    componentDidUpdate() {}

    determineVariant() {
        let className;
        switch (this.props.variant) {
            case "rectangular":
                className = "rectangular";
                break;
            case "circular":
                className = "circular";
                break;
            case "text":
                className = "text";
                break;
            default:
                className = "rectangular";
        }
        return className;
    }

    determineAnimation() {
        let animationToShow;
        switch (this.props.animation) {
            case "wave":
                animationToShow = "wave";
                break;
            case "pulse":
                animationToShow = "pulse";
                break;
            default:
                animationToShow = "wave";
        }
        return animationToShow;
    }

    render() {
        let variantToShow;
        switch (this.props.variant) {
            case "rectangular":
                variantToShow = "rectangular";
                break;
            case "circular":
                variantToShow = "circular";
                break;
            case "text":
                variantToShow = "text";
                break;
            default:
                variantToShow = "rectangular";
        }

        let animationToShow;
        switch (this.props.animation) {
            case "wave":
                animationToShow = "wave";
                break;
            case "pulse":
                animationToShow = "pulse";
                break;
            default:
                animationToShow = "wave";
        }

        return (
            <Skeleton
                variant={this.determineVariant}
                animation={animationToShow}
                content={this.props.content}
                width={Number(this.props.width)}
                height={Number(this.props.height)}
            />
        );
    }
}
